(ns onyx-log-ui.component.onyx-log
  (:require [onyx.api :refer [subscribe-to-log shutdown-env]]
            [onyx.extensions :as extensions]
            [clojure.core.async :refer [chan put! close! <!!]]
            [clojure.java.io :as io]
            [com.stuartsierra.component :as component]))

(defn peer-config [zookeeper-address]
  {:onyx/id "dev-tenancy"
   :zookeeper/address zookeeper-address
   :onyx.peer/job-scheduler :onyx.job-scheduler/greedy
   :onyx.peer/zookeeper-timeout 60000
   :onyx.messaging.aeron/embedded-driver? true
   :onyx.messaging/allow-short-circuit? false
   :onyx.messaging/impl :aeron
   :onyx.messaging/peer-port 40199
   :onyx.messaging/bind-addr "localhost"})

;; For testing only :)
(defn- flush-log! [{:keys [replica env] :as log} ch]
  (try
    (loop [rep replica]
      (when-let [entry (<!! ch)]
        ;; TODO: make apply-log-entry a chan xform?
        (let [result (extensions/apply-log-entry entry rep)]
          (println (str "=== entry id " (:message-id entry) " ==="))
          (println (str "Function: " (:fn entry)))
          (println (str "ZooKeeper Timestamp: " (:created-at entry)))
          (println (str "Peers: " (:peers result)))
          (println (str "Jobs: " (:jobs result)))
          (println "Allocations ...")
          (clojure.pprint/pprint (:allocations result))
          (recur result))))
    (catch InterruptedException e)
    (catch ThreadDeath e)))

(defrecord OnyxLogClient [zookeeper-address]
  component/Lifecycle
  (start [component]
    (if-not (:onyx-log component)
      (let [ch (chan 1000)
            log (onyx.api/subscribe-to-log (peer-config zookeeper-address) ch)]
        (future
          (flush-log! log ch))
        (assoc component :onyx-log log, :onyx-log-ch ch))
      component))
  (stop [component]
    (if-let [log (:onyx-log component)]
      (do (close! (:onyx-log-ch component))
          (onyx.api/shutdown-env (:env log))
          (dissoc component :onyx-log :onyx-log-ch))
      component)))

(def log-dump
  (-> (slurp (io/resource "log-dump.edn"))
      read-string))

(defn stream-test-log!
  [ch]
  (future
    (doseq [{:keys [message-id] :as entry} (reverse (:log-entries log-dump))]
      (Thread/sleep 100)
      (put! ch {:entry entry
                :replica-state (get-in log-dump [:replica-states message-id])}))))

(defrecord OnyxLogClientMock []
  component/Lifecycle
  (start [component]
    (if-not (:onyx-log-ch component)
      (assoc component :onyx-log-ch (chan 1000))
      component))
  (stop [component]
    (if-let [ch (:onyx-log-ch component)]
      (do (close! ch)
          (dissoc component :onyx-log-ch))
      component)))

(defn onyx-log-client-component [options]
  ;; (map->OnyxLogClient options)
  (->OnyxLogClientMock))

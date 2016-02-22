(ns onyx-log-ui.component.aleph
  (:require [aleph.http :as http]
            [com.stuartsierra.component :as component]
            [suspendable.core :as suspendable]))

(defrecord AlephServer [app]
  component/Lifecycle
  (start [component]
    (if (:server component)
      component
      (let [options (-> component (dissoc :app))
            handler (atom (delay (:handler app)))
            server (http/start-server (fn [req] (@@handler req)) options)]
        (assoc component
               :server server
               :handler handler))))
  (stop [component]
    (if-let [server (:server component)]
      (do (.close server)
          (dissoc component :server :handler))
      component))
  suspendable/Suspendable
  (suspend [component]
    (if-let [handler (:handler component)]
      (do (reset! handler (promise))
          (assoc component :suspended? true))
      component))
  (resume [component old-component]
    (if (and (:suspended? old-component)
             (= (dissoc component :suspended? :server :handler :app)
                (dissoc old-component :suspended? :server :handler :app)))
      (let [handler (:handler old-component)]
        (deliver @handler (:handler app))
        (-> component
            (assoc :server (:server old-component), :handler handler)
            (dissoc :suspended?)))
      (do (when old-component (component/stop old-component))
          (component/start component)))))

(defn aleph-server
  [options]
  (map->AlephServer options))

(ns onyx-log-ui.component.bidi
  (:require [bidi.ring :refer [make-handler]]
            [com.stuartsierra.component :as component]))

(defn- find-endpoint-keys [component]
  (sort (map key (filter (comp :routes val) component))))

(defn- find-routes [component]
  (map #(:routes (get component %))
       (:endpoints component (find-endpoint-keys component))))

(defrecord BidiHandler []
  component/Lifecycle
  (start [component]
    (if-not (:handler component)
      (let [routes ["/" (find-routes component)]]
        (assoc component :handler (make-handler routes)))
      component))
  (stop [component]
    (if (:handler component)
      (dissoc component :handler)
      component)))

(defn bidi-handler-component []
  (->BidiHandler))

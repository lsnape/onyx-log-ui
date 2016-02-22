(ns onyx-log-ui.system
  (:require [clojure.java.io :as io]
            [com.stuartsierra.component :as component]
            [duct.component.endpoint :refer [endpoint-component]]
            [duct.middleware.not-found :refer [wrap-not-found]]
            [duct.middleware.route-aliases :refer [wrap-route-aliases]]
            [meta-merge.core :refer [meta-merge]]
            [onyx-log-ui.component.aleph :refer [aleph-server]]
            [onyx-log-ui.component.bidi :refer [bidi-handler-component]]
            [onyx-log-ui.endpoint.example :refer [example-endpoint not-found]]))

(def base-config
  {})

(defn new-system [config]
  (let [config (meta-merge base-config config)]
    (-> (component/system-map
         :app  (bidi-handler-component)
         :http (aleph-server (:http config))
         :example (endpoint-component example-endpoint)
         :not-found (endpoint-component not-found))
        (component/system-using
         {:http [:app]
          :app  [:example :not-found]}))))

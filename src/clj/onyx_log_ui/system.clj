(ns onyx-log-ui.system
  (:require [com.stuartsierra.component :as component]
            [duct.component.endpoint :refer [endpoint-component]]
            [meta-merge.core :refer [meta-merge]]
            [onyx-log-ui.component
             [aleph :refer [aleph-server]]
             [bidi :refer [bidi-handler-component]]]
            [onyx-log-ui.endpoint.endpoints :as endpoint]))

(def base-config
  {:zookeeper-address "192.168.99.100:32772"})

(defn new-system [config]
  (let [config (meta-merge base-config config)]
    (-> (component/system-map
         :app (bidi-handler-component)
         :http (aleph-server (:http config))
         #_#_ :onyx-log-client (onyx-log-client-component config)
         :index (endpoint-component endpoint/index-endpoint)
         :static (endpoint-component endpoint/static-endpoint)
         :not-found (endpoint-component endpoint/not-found-endpoint))
        (component/system-using
         {:http [:app]
          :app [:index :static :not-found]}))))

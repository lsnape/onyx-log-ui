(ns onyx-log-ui.endpoint.endpoints
  (:require [bidi.ring :as ring :refer [resources-maybe ->Files]]
            [clojure.core.async :refer [chan]]
            [clojure.java.io :as io]
            [onyx-log-ui.component.onyx-log :refer [stream-test-log!]]
            [yada.protocols :refer [as-resource]]
            [yada.yada :refer [yada resource]]))

(defn onyx-log-stream-endpoint [config]
  ["1.x/" {"onyx-log-stream"
           (yada (resource {:methods
                            {:get
                             {:produces "text/event-stream"
                              :response (doto (chan 100)
                                          (stream-test-log!))}}}))}])

(defn index-endpoint [config]
  ["" (yada (io/resource "onyx_log_ui/public/index.html"))])

(defn static-endpoint [config]
  ["" (resources-maybe {:prefix "onyx_log_ui/public/"})])

(defn not-found-endpoint [config]
  [true (as-resource nil)])


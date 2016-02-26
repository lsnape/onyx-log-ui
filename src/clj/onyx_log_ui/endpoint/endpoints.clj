(ns onyx-log-ui.endpoint.endpoints
  (:require [bidi.ring :as ring :refer [resources-maybe ->Files]]
            [clojure.java.io :as io]
            [yada.protocols :refer [as-resource]]
            [yada.yada :refer [yada]]))

(defn index-endpoint [config]
  ["" (yada (as-resource
             (io/resource "onyx_log_ui/public/index.html")))])

(defn static-endpoint [config]
  ["" (resources-maybe {:prefix "onyx_log_ui/public/"})])

(defn not-found-endpoint [config]
  [true (as-resource nil)])


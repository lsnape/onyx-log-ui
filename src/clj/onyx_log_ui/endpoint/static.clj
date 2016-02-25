(ns onyx-log-ui.endpoint.static
  (:require [bidi.ring :as ring :refer [resources-maybe ->Files]]
            [clojure.java.io :as io]
            [yada.protocols :refer [as-resource]]
            [yada.yada :refer [yada]]))

(def index-handler
  (yada (as-resource
           (io/resource "onyx_log_ui/public/index.html"))))

(defn static-endpoint [config]
  ["" [["" index-handler]
       ["" (resources-maybe {:prefix "onyx_log_ui/public/"})]
       [true (as-resource nil)]]])

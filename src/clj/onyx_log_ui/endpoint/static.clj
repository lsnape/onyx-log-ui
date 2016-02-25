(ns onyx-log-ui.endpoint.static
  (:require [bidi.ring :refer [->ResourcesMaybe]]
            [yada.protocols :refer [as-resource]]))

(defn static-endpoint [config]
  ["" (bidi.ring/->ResourcesMaybe {:prefix "onyx_log_ui/public/"})])

(defn not-found [config]
  [true nil])

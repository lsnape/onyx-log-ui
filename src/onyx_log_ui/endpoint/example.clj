(ns onyx-log-ui.endpoint.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]))

(defn example-endpoint [config]
  ["example" (fn [req]
               (ring.util.response/response (str "this is an example")))])

(defn not-found [config]
  [true (fn [req]
          (ring.util.response/not-found "Not found."))])

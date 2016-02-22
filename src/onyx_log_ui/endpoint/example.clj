(ns onyx-log-ui.endpoint.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]
            [yada.yada :refer [yada]]))

(defn example-endpoint [config]
  ["example" (yada "this is an example")])

(defn not-found [config]
  [true (yada.protocols/as-resource nil)])

(ns user
  (:require [clojure.repl :refer :all]
            [clojure.pprint :refer [pprint]]
            [clojure.tools.namespace.repl :refer [refresh]]
            [clojure.java.io :as io]
            [com.stuartsierra.component :as component]
            [eftest.runner :as eftest]
            [meta-merge.core :refer [meta-merge]]
            [reloaded.repl :refer [system init start stop go reset]]
            [ring.middleware.stacktrace :refer [wrap-stacktrace]]
            [duct.component.figwheel :as figwheel]
            [onyx-log-ui.config :as config]
            [onyx-log-ui.system :as system]))

(def dev-config
  {:app {:middleware [wrap-stacktrace]}
   :figwheel
   {:css-dirs ["resources/onyx_log_ui/public/css"]
    :builds   [{:source-paths ["src/cljs" "dev"]
                :build-options
                {:optimizations :none
                 :main "cljs.user"
                 :asset-path "/js"
                 :output-to  "target/figwheel/onyx_log_ui/public/js/main.js"
                 :output-dir "target/figwheel/onyx_log_ui/public/js"
                 :source-map true
                 :source-map-path "/js"}}]}})

(def config
  (meta-merge config/defaults
              config/environ
              dev-config))

(defn new-system []
  (into (system/new-system config)
        {:figwheel (figwheel/server (:figwheel config))}))

(ns-unmap *ns* 'test)

(defn test []
  (eftest/run-tests (eftest/find-tests "test") {:multithread? false}))

(defn cljs-repl []
  (figwheel/cljs-repl (:figwheel system)))

(when (io/resource "local.clj")
  (load "local"))

(reloaded.repl/set-init! new-system)

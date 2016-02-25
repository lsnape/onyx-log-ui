(ns cljs.user
  (:require [figwheel.client :as figwheel]
            onyx-log-ui.core))

(js/console.info "Starting in development mode")

(enable-console-print!)

(figwheel/start {:websocket-url "ws://localhost:3449/figwheel-ws"})

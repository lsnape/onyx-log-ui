(ns onyx-log-ui.parser
  (:require [om.next :as om]))

(defn read [{:keys [state ast] :as env} k params]
  (if-let [[_ value] (find @state k)]
    (merge {:value value}
           (when (and (= k :log-entries) (empty? value))
             {:log-stream ast}))
    {:value :not-found}))

(def parser
  (om/parser {:read read}))

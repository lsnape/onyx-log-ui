(ns onyx-log-ui.core
  (:require-macros [cljs.core.async.macros :refer [go go-loop]])
  (:require [cljs.core.async :refer [chan put!]]
            [onyx-log-ui.parser :refer [parser]]
            [cljs.reader :refer [read-string]]
            [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [sablono.core :as html :refer-macros [html]]))

(defui LogEntry
  static om/Ident
  (ident [this {:keys [message-id]}]
    [:log-entry/by-id message-id])
  static om/IQuery
  (query [this]
    [:message-id :fn :created-at])
  Object
  (render [this]
    (let [props (om/props this)]
      (html
       [:div.log-entry.media {:on-click
                              (fn [_]
                                (prn (:message-id props)))}
        [:div.media-content
         (name (:fn props))
         [:br]
         [:small (:created-at props)]]]))))

(def log-entry
  (om/factory LogEntry {:keyfn :message-id}))

(defui LogViewport
  static om/IQuery
  (query [_]
    [:log-entries])
  Object
  (render [this]
    (let [log-entries (om/props this)]
      (html
       [:div.log-viewport
        (map log-entry log-entries)]))))

(def log-viewport
  (om/factory LogViewport))

(defn header []
  [:header.header
   [:div.header-left
    [:div.header-item
     [:img {:src "/img/onyx-logo.png"}]]
    [:div.header-item
     [:h1.title "Onyx Log Dashboard"]]]])

(defui RootView
  static om/IQuery
  (query [_]
    [:log-entries :replica-states])
  Object
  (render [this]
    (let [{:keys [log-entries] :as props} (om/props this)]
      (html
       [:div
        (header)
        [:div.columns
         [:div.column.is-third
          (log-viewport log-entries)]]]))))

(defn custom-merge-tree [a b]
  (if (map? a)
    (merge-with into a b)
    b))

(def send-chan
  (chan))

(defn stream-log-events! [ch]
  (go-loop [callback-fn (<! ch)]
    (-> (new js/EventSource "/1.x/onyx-log-stream")
        (.addEventListener "message"
                           (fn [event]
                             (let [{:keys [entry replica-state]} (read-string (.-data event))]
                               (callback-fn {:log-entries [(select-keys entry [:message-id :fn :created-at])]
                                             :replica-states {(:message-id entry) (:allocations replica-state)}})))))
    (recur (<! ch))))

(def reconciler
  (om/reconciler
   {:state {:log-entries [], :replica-states {}}
    :parser parser
    :send (fn [{:keys [log-stream]} callback-fn]
            (when log-stream
              (put! send-chan callback-fn)))
    :merge-tree custom-merge-tree
    :remotes [:log-stream]}))

(stream-log-events! send-chan)

(om/add-root! reconciler
              RootView (gdom/getElement "app"))

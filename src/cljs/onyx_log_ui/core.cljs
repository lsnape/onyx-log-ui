(ns onyx-log-ui.core
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [onyx-log-ui.state :refer [app-state]]
            [sablono.core :as html :refer-macros [html]]))

(defn read [{:keys [state] :as env} key params]
  (if-let [[_ value] (find @state key)]
    {:value value}
    {:value :not-found}))

(defn mutate [{:keys [state] :as env} key params]
  {:value :not-found})

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
       [:div.media
        [:div.container
         (name (:fn props))]]))))

(def log-entry
  (om/factory LogEntry {:keyfn :message-id}))

(defui LogViewport
  Object
  (render [this]
    (let [{:keys [log-entries]} (om/props this)]
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
  Object
  (render [this]
    (let [{:keys [log-entries] :as props} (om/props this)]
      (html
       [:div
        (header)
        [:div.columns
         [:div.column.is-third
          (log-viewport props)]]]))))

(def reconciler
  (om/reconciler
    {:state app-state
     :parser (om/parser {:read read :mutate mutate})}))

(om/add-root! reconciler
  RootView (gdom/getElement "app"))

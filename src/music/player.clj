(ns music.player
  (:require [edna.core :as edna]))

(defonce current-score (atom nil))

(defn stop! []
  (swap! current-score edna/stop!))

(defn play! [music]
  (swap! current-score edna/stop!)
  (reset! current-score (edna/play! music)))

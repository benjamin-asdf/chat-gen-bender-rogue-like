(ns faster-than-light.memes.benders.main
  (:require
   [reagent.core :as r]
   [reagent.dom :as rdom]))

(def initial-state {})

(defonce state (r/atom initial-state))

(def size 32)
(def visible-dist 9)
(def visible-dist-sq (js/Math.pow visible-dist 2))
(def clear-dist 7)
(def clear-dist-sq (js/Math.pow clear-dist 2))

(defn game [state]

  )

(defn start {:dev/after-load true} []
  (rdom/render
   [:div "hello"]
   (js/document.getElementById "app")))


(defn main! [] (start))

(ns faster-than-light.memes.benders.main
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(def initial-state {})

(defonce state (local-storage (r/atom initial-state) :game-state))



(defn game [state]

  )

(defn start {:dev/after-load true} []
  (rdom/render
   [:div "hello"]
   (js/document.getElementById "app")))


(defn main! [] (start))

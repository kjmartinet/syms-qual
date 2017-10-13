(ns syms-qual.data.scenes
  (:require [syms-qual.data.scenes.title-screen :as title-screen]
            [syms-qual.data.scenes.route-66.intro :as intro]
            [syms-qual.data.scenes.route-66.options :as intro-options]
            [syms-qual.data.scenes.route-66.dates :as intro-dates]

            [syms-qual.data.scenes.anubis.cutscenes :as anubis-cutscenes]
            [syms-qual.data.scenes.anubis.pharah :as anubis-pharah]
            [syms-qual.data.scenes.anubis.genji :as anubis-genji]
            [syms-qual.data.scenes.anubis.zarya :as anubis-zarya]

            [syms-qual.data.characters :as char]
            [syms-qual.data.bg :as bg]
            [carmen.data :as data]))

(def structure
  {:route-66 (merge intro/data intro-options/data intro-dates/data)
   :anubis (merge anubis-cutscenes/data anubis-pharah/data anubis-genji/data anubis-zarya/data)
   :eichenwalde (merge)
   :gibralter (merge)
   :dorado (merge)
   :hollywood (merge)
   :volskaya (merge)
   :lijiang (merge)
   :kings-row (merge)
   :numbani (merge)
   :title-screen (merge title-screen/data)})

(def data (data/reify-scenes char/data bg/data structure))

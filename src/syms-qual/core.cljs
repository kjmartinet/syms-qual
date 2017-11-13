(ns syms-qual.core
  (:require [carmen.miranda :as miranda]
            [carmen.util :as util]
            [syms-qual.data.scenes :as scenes]
            [syms-qual.data.state-dump :as dump]))

(enable-console-print!)

(def graph
  {:scenes scenes/data})

(def base-state
  {:scene [:title-screen [:bg :default] 0]
   :saved (util/load! :saved)
   :miranda/auto-save false
   :points/sombra 0
   :points/junkrat 0
   :points/pharah 0})

(def logo-size [120 120])

(defn dots [state]
  (let [n (js/Math.ceil (rem (/ (:miranda/time state) 800) 4))
        x (if (zero? n) n (dec n))]
    (map
     (fn [i]
       [(if (> x i) :span :span.dark) "."])
     (range 3))))

(defn loading-screen [{:keys [window] :as state} graph options]
  (let [rat (util/scale state options)
        [x y] logo-size]
    [:div.base-scene
     {:style {:height (util/px (:y window))
              :width (util/px (:x window))}}
     [:div.loading-outer
      [:div.loading-inner
       [:div.loading-screen
        [:img {:src "img/overwatchLogo.svg"
               :style {:height (util/px (* rat y))
                       :width  (util/px (* rat x))}}]
        (into
         [:div.loading-screen-text
          [:span "Loading"]]
         (dots state))]]]]))

(def options
  {:miranda/click-delay 100
   :miranda/native-resolution [2048 1080]
   :miranda/base-text-size 32
   :miranda/letterbox-ratio 1.78
   :miranda/full-screen? true
   ;;TODO: Change me for production
   :miranda/max-load-time 0
   :loading-screen loading-screen
   :miranda/key-events {}})

(def ng-scene [:route-66 [:diner :intro] 0])

(defn menu-container [transition-fn]
  (fn [name]
    (let [container
          (if transition-fn
            [:div.menu-text
             {:on-click (partial transition-fn name)}]
            [:div.menu-text.disabled])]
      (conj container [:div.inner-text [:span.arrow "▶ "] [:span name]]))))

(defn menu [load? & [transition-fn]]
  (let [container (menu-container transition-fn)]
    [:div.menu
     [:div.title [:span.symmetra "Symmetra's "] [:span.text "Qualifying Matches"]]
     [:div.outer-container
      [:div.inner-container
       (container "New Game")
       (when load? (container "Load Game"))]]]))

(defn new-game-guard-menu [transition-fn]
  (let [container (menu-container transition-fn)]
   [:div.menu
    [:div.title
     [:span.text.symmetra "Delete old save?"]]
     [:div.outer-container
      [:div.inner-container
       (container "Continue")
       (container "Return")]]]))

(defn base-scene-style [window]
  {:background-image "url(\"img/Backgrounds/title_screen_bg.png\")"
   :background-size "cover"
   :height (str (:y window) "px")
   :width (str (:x window) "px")})

(defn title-screen-style [window]
  {:bottom (str (:y-adjust window) "px")})

(defmethod miranda/render :syms-qual/intro
  [{:keys [window] :as state} transition-fn graph options]
  (miranda/wrap-optional-buttons
   state transition-fn options
   [:div.base-scene {:style (base-scene-style window)}
     [:div.title-screen.menu-container {:style (title-screen-style window)}
      (menu (:saved state) transition-fn)]]))

(defmethod miranda/render :syms-qual/new-game-guard
  [{:keys [window] :as state} transition-fn graph options]
  (miranda/wrap-optional-buttons
   state transition-fn options
   [:div.base-scene
    {:style (base-scene-style window)}
    [:div.title-screen.menu-container {:style (title-screen-style window)}
     (new-game-guard-menu transition-fn)]]))

(defmethod miranda/render :syms-qual/options
  [{:keys [window] :as state} transition-fn graph options]
  (miranda/wrap-optional-buttons
   state transition-fn options
   [:div.base-scene
    {:style (base-scene-style window)}
    [:div.title-screen.menu-container {:style (title-screen-style window)}
     (menu (:saved state))]]))

(defn continue [state]
  (util/save! :saved true)
  (assoc
   state
   :new-game? false
   :miranda/auto-save true
   :scene ng-scene))

(defn new-game [state]
  (if (:saved state)
    (assoc state :scene [:title-screen [:bg :new-game-guard] 0])
    (continue state)))

(defn load-game [state]
  (util/load! :save))

(defn view-options [state]
  (assoc state :scene [:title-screen [:bg :options] 0]))

(defn main-menu [state]
  (assoc state :scene [:title-screen [:bg :default] 0]))

(defmethod miranda/transition :syms-qual/intro
  [state graph options button]
  (case button
    "New Game" (new-game state)
    "Load Game" (load-game state)
    "Options" (view-options state)
    "Continue" (continue state)
    "Return" (main-menu state)))

(defonce state-atom (reagent.core/atom base-state))

;; TODO: think harder about this tooling
(defonce saved-state (atom {}))

(defn save [] (reset! saved-state @state-atom))

(defn load
  ([] (load @saved-state))
  ([a]
   (case a
     2 (reset! state-atom dump/day-2)
     (reset! state-atom a))))

(miranda/samba! "app" state-atom graph options)



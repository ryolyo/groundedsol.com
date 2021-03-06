(ns compass.helpers
  (:require [garden.core :refer :all]
            [garden.def :refer [defcssfn]]
            [garden.units :refer :all]
            [compass.util :as util]
            [clojure.set :as set]
            [clojure.string :as str]
            [compass.config :refer [*config*]])
  (:import [java.io File]
           [org.apache.commons.codec.binary Base64]))

;; Compass/Color Stops
;; Compass/Colors
;; Compass/Constants

(defn opposite-position [position]
  (let [opposites {:top    :bottom
                   :left   :right
                   :center :center}]
    (if-let [opposite (or (opposites position)
                          ((set/map-invert opposites) position))]
      opposite
      (ex-info "Cannot determine the opposite position of:"
               {:position position}))))

(comment
  === HELPERS ===
  Cross Browser
  Display Helpers
  Font Files
  Image Dimensions --> compass.helpers.image-dimenensions
  Inline Data      --> compass.helpers.inline-data
  Math
  Selectors
  Sprites
  URLs             --> compass.helpers.urls
)

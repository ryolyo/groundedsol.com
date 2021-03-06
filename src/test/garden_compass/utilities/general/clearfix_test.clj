(ns compass.utilities.general.clearfix-test
  (:require [expectations :refer :all]
            [compass.utilities.general.clearfix :refer :all]
            [compass.css3 :refer [*options*]]
            [garden.compiler :refer [compile-css]]))

(expect "{overflow:hidden;*zoom:1}"
        (compile-css {:pretty-print? false} (clearfix)))

;; (println (compile-css [:foo (pie-clearfix)]))

;; (println (compile-css [:foo (legacy-pie-clearfix)]))

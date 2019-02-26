(ns clojure.test.check.test2
  (:require [cljs.test :as t :refer-macros [deftest is]]
            [clojure.test.check.generators :as gen]))

(deftest can-use-gen-let-without-include-macros
  (is (gen/let [x gen/nat]
        (number? x))))

(t/run-tests)

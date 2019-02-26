(ns clojure.test.check.cljs-macro-test
  (:require [clojure.test.check.generators :as g]
            [clojure.test :as t :refer [deftest is]]))

(deftest let-test
  (is (g/let [n (g/choose 0 10)] n)))

(t/run-tests)

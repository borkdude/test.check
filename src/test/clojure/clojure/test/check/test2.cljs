(ns clojure.test.check.test2
  (:require [cljs.test :refer-macros [deftest is]]
            [clojure.test.check.generators :as gen]))

(deftest can-use-gen-let-without-include-macros
  (is (gen/let [x gen/nat] 42)))

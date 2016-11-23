(ns bcug.mmxvi-xi.spec
  (:require [clojure.spec :as s]
            [clojure.spec.gen :as gen]))



;;(gen/generate (s/gen int?))

;; (gen/sample (s/gen string?))
;; (s/exercise integer? 5)

(s/unform number? 23)

(s/registry)g

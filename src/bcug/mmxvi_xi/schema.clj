(ns bcug.mmxvi-xi.schema
  (:require [schema.core :as s]
            [schema.coerce :as c]
            [schema.utils :refer [error]]
            [schema-generators.complete :as gc]
            [schema-generators.generators :as g]))

(s/defschema Person
  {:name s/Str
   :age s/Int})

(s/defn calc :- s/Str
  [x :- s/Int
   y :- s/Int]
  (str (+ x y)))

(comment

  (s/def Me :- Person
    {:name "" :age "asd"})

  (g/generate Person)

  (g/sample 2 Person)

  )

(ns exercise6)

(defn faverage
  "Returns the average of a sequence of numbers."
  [secuencia]
  (/ (reduce + secuencia) (count secuencia))
)
(ns exercise7)

(defn fmap
  "Maps values in a sequence."
  [f secuencia]
  (if (map? secuencia)
    (into {} (for [[clave valor] secuencia] [clave (inc valor)]))
    (map f secuencia))
)
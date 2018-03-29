(ns exercise11)

(defn fmap-nil
  "Returns if a value associated with a key is nil."
  [mapa clave]
  (nil? (clave mapa))
)
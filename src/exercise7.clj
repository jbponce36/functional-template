(ns exercise7)

(defmulti fmap
  "Maps values in a sequence."
  (fn [f secuencia] (type secuencia)))

(defmethod fmap clojure.lang.PersistentArrayMap
  [f secuencia]
	(into {} (for [[clave valor] secuencia] [clave (inc valor)])))

(defmethod fmap :default
  [f secuencia]
  (map f secuencia))

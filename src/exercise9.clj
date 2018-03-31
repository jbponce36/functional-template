(ns exercise9)

(defmulti things (fn [algo] (type algo)))

(defmethod things java.lang.String
  [algo]
	"Soy un String")

(defmethod things clojure.lang.PersistentArrayMap
  [algo]
	"Soy un Map")

(defmethod things clojure.lang.PersistentVector
  [algo]
  "Soy un Vector")

(defmethod things :default
  [algo]
  "Soy un default")

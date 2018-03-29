(ns exercise8)

(defn fderive
  "Returns a function that approximates its derivate."
  [f h]
  (fn [x] (/ (- (f (+ x h)) (f (- x h))) (* 2 h)))
)
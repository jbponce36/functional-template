(ns exercise3)

(defn fibonacci 
  "Returns fibonacci applied to x"
  [x]
  (if (or (= x 0) (= x 1)) x (+ (fibonacci(- x 1)) (fibonacci(- x 2))))
)

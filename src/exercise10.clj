(ns exercise10)

(defn fvariance
  "Returns the variance of a list of numbers."
  [lista]
  (let [promedio (/ (reduce + lista) (count lista))] 
    (* 
      (/ 1 (count lista)) 
      (reduce + (map (fn [x] (* (- x promedio) (- x promedio))) lista)))
    )
)
(ns exercise2) 

(defn only-greater-than-five 
  "Filters a list with elements that are less than five." 
  [lista] 
  (for [x lista :when (< 5 x)] 
    x)
)
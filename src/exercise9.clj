(ns exercise9)

(defn things
  "Returns a legend"
  [algo]
  (if (string? algo)
      "Soy un String"
      (if (vector? algo)
          "Soy un Vector"
          (if (map? algo)
              "Soy un Map"
              "Soy un default")))
)
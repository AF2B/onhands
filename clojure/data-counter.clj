(defn parse-int [s]
  (try
    (Integer/parseInt s)
    (catch NumberFormatException e 0)))

(defn json-format-counters [data page]
  (if (or (nil? data) (empty? data))
    {:data [] :totalCount 0 :itemCount 0 :page page}
    (let [item-count (count data)
          total-count (reduce + (map #(parse-int (% "count")) data))]
      {:data data :totalCount total-count :itemCount item-count :page page})))
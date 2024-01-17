(defn limit-params [params]
  (let [limit (get params "limit" "10")
        valid-limits #{"25" "50"}]
    (if (valid-limits limit)
      (Integer/parseInt limit)
      10)))

(defn offset [limit page]
  (* (- page 1) limit))

(defn page-params [params]
  (let [page (get params "page" "1")]
    (Integer/parseInt page)))
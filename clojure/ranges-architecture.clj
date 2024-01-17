(defn ranges-architecture [data]
  (let [age-groups {:2-6 0, :7-12 0, :13-18 0, :19-24 0, :25-30 0, :31-36 0, :37-42 0, :43-48 0, :49+ 0}]
    (reduce (fn [acc item]
              (let [{:keys [age count]} item]
                (cond
                  (and (>= age 2) (<= age 6)) (update acc :2-6 + count)
                  (and (>= age 7) (<= age 12)) (update acc :7-12 + count)
                  (and (>= age 13) (<= age 18)) (update acc :13-18 + count)
                  (and (>= age 19) (<= age 24)) (update acc :19-24 + count)
                  (and (>= age 25) (<= age 30)) (update acc :25-30 + count)
                  (and (>= age 31) (<= age 36)) (update acc :31-36 + count)
                  (and (>= age 37) (<= age 42)) (update acc :37-42 + count)
                  (and (>= age 43) (<= age 48)) (update acc :43-48 + count)
                  (>= age 49) (update acc :49+ + count))))
            age-groups
            data)))
(defn format-course
  [{:keys [client course_id course_name environment_name
           enrolled accessed notAccessed percentAccessed percentNotAccessed]}]
  {:client client
   :id course_id
   :course {:name course_name}
   :environment {:name environment_name}
   :enrolled enrolled
   :accessed accessed
   :notAccessed notAccessed
   :percentAccessed percentAccessed
   :percentNotAccessed percentNotAccessed})

(defn format-courses
  [courses page-params]
  (let [formatted-courses (map format-course courses)
        item-count (count courses)]
    {:courses formatted-courses
     :itemCount item-count
     :totalCount item-count
     :pageParams page-params}))
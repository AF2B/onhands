(defn get-filter [params id]
  (if (and params (contains? params id))
    (get params id)
    nil))

(defn user-filter [params]
  (get-filter params "user"))

(defn platform-filter [params]
  (get-filter params "platform"))

(defn environment-filter [params]
  (get-filter params "environment"))

(defn course-filter [params]
  (get-filter params "course"))

(defn space-filter [params]
  (get-filter params "space"))

(defn subject-filter [params]
  (get-filter params "subject"))

(defn student-filter [params]
  (get-filter params "student"))

(defn lecture-filter [params]
  (get-filter params "lecture"))

(defn data-filter [params]
  (if (and params (contains? params "start") (contains? params "end"))
    {:start_date (get params "start") :end_date (get params "end")}
    nil))

;; FIXME
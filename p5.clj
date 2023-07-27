(defn evenly-div-20? [x]
  (every? (fn [n] (zero? (mod x n))) [20 19 18 17 16 15 14 13 12 11]))

(defn brute-force []
  (->> (range)
       (rest)
       (drop-while (complement evenly-div-20?))
       (first)))

(time (brute-force))

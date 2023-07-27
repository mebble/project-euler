(defn palindrome? [s]
  (= (reverse s)
     (seq s)))


(defn brute-force []
  (->> (for [x (range 999 100 -1)
             y (range 999 100 -1)]
         (vector x y))
       (map (partial apply *))
       (filter (comp palindrome? str))
       (apply max)))

(time (brute-force))

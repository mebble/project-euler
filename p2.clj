;; https://projecteuler.net/problem=2

(defn fib-naive [i]
  (case i
    0 1
    1 2
    (+ (fib-naive (dec i))
       (fib-naive (dec (dec i))))))

(def fib
  (memoize 
    (fn [i]
      (case i
        0 1
        1 2
        (+ (fib (dec i)) (fib (dec (dec i))))))))

(->> (range)
     (map fib)
     (filter even?)
     (take-while #(<= % 4000000))
     (apply +))

(time (fib 20))
(time (fib-naive 20))

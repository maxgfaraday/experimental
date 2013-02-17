(ns ^{:doc "This is core code for sixthcolumn"
      :author "Gavin M. Bell"} 
  org.sixthcolumn.core
  (:use [org.sixthcolumn.experimental.barber-shop :only (info about)] :reload-all :verbose)
  (:gen-class))

(println "Just so you know I am bout to get busy on this money")

(defn foo 
  "now I can say some shit about this function"
  {::testkey "value"}
  [^Integer x]
  (println "Hello, World! " x)
  (* x x))

(foo 4)

(defn bar [] "this is the doc string"
  (println "some stuff"))

(bar)

(defn factorial [x]
  "Some code to do factorial"
  (if (zero? x)
    1
    (* x (factorial (dec x)))))

(factorial 10)

(defn -main [& args]
  (println "You are now rockin with the best"))

;Multiple arities
(defn my-name-is 
  ([] (my-name-is "default"))
  ([^String x] (println "Ny name is:" x)))

(my-name-is)
(my-name-is "Gavin M. Bell")

(info)
(about)
;(org.sixthcolumn.experimental.barber-shop/launch)


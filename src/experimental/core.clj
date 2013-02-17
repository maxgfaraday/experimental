(ns experimental.core
  (:gen-class))

(println "Just so you know I am bout to get busy on this money")

(defn foo 
  "now I can say some shit about this function"
  {:testkey "value"}
  [^Integer x]
  (println "Hello, World!")
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
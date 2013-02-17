(ns org.sixthcolumn.experimental.barber-shop)
(println "Welcome to the barber shop!")

(def empty-seats (ref 3))
(def barber (agent 0))

(defn debug [msg n]
  (println msg (apply str (repeat (- 35 (count msg)) \space)) n))

(flush)

(defn cut-hair 
  "Represents the barber cutting a customer's hair"
  [tally n]
  (dosync (commute empty-seats inc))
  (debug "(b) cutting hair of customer" n)
  (Thread/sleep (+ 100 (rand-int 60)))
  (debug "(b) done cutting hair of customer" n)
  (inc tally))

(defn enter-the-shop
  "Represents a customer entering the barber shop"
  [n]
  (debug "(c) entering the barber shop" n)
  (when-not (dosync
             (when (pos? @empty-seats)
               (alter empty-seats dec)
               (send-off barber cut-hair n)))
    (debug "(s) turning away customer" n)))

(defn launch 
  "Generates a set of customers and dispatches them at random intervals to enter the barber shop"
  []
  (doseq  [customer (range 1 30)]
    (Thread/sleep (+ 100 (rand-int 10)))
    (future (enter-the-shop customer)))
  (println "... Customer line empty ...\n"))

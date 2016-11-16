(ns hello-world.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]])
  (:gen-class))

(defroutes myapp
  (GET "/" [] "Hello Ponds , Nom .s.s "))

(defn -main []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (run-server myapp {:port port})
    (println (str "Listening on port " port))))

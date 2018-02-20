(ns hello-world.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]]
             [clojure.java.shell :as sh])

  (:gen-class))

(defroutes myapp
  (GET "/" [] "Hola from packer and terraform")
  (GET "/env" [] (:out (sh/sh "env")))
  (GET "/co" [] "Colombia "))


(defn -main []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "3000"))]
    (run-server myapp {:port port})
    (println (str "Listening on port " port))))

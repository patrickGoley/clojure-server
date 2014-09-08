(defproject http-server "0.1.0-SNAPSHOT"
  :description "A simple http server"
  :url "http://tranquil-river-1074.herokuapp.com/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [de.ubercode.clostache/clostache "1.3.1"]
                 [lobos "1.0.0-beta3" :exclusions [org.clojure/tools.macro]]
                 [postgresql "9.1-901.jdbc4"]]
  :main http-server.core
  :min-lein-version "2.0.0")

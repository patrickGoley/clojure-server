(defproject http-server "0.1.0-SNAPSHOT"
  :description "A simple http server"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [de.ubercode.clostache/clostache "1.3.1"]]
  :main http-server.core
  :min-lein-version "2.0.0")

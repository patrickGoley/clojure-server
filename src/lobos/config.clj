(ns lobos.config
  (:use [lobos.connectivity]))

(def db
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :user "cgnzeetnpkoqyc"
   :password "-eABQ0ah6GObSZzUY44hKtxbru"
   :subname "//localhost:5432/px"})


(open-global db)

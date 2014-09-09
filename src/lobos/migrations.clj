(ns lobos.migrations
  (:refer-clojure :exclude [alter defonce drop bigint boolean char double float time])
  (:use (lobos [migration :only [defmigration]] core schema) lobos.config))

(defmigration create-users
  (up [] (create (table :users
                        (integer :id :primary-key)
                        (varchar :email 256 :unique))))
  (down [] (drop (table :users))))

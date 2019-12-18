(ns music.core
  (:require [music.player :refer [play! stop!]]))

; You can directly play notes
#_(play! [:piano #{:c :e :g} :a :c :d :c])

; You can load sheets
#_(play! (load-file "src/music/music.clj"))

; Stop the music from here
#_(stop!)

; Enjoy !

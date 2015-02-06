(ns leiningen.new.simpleudf
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "simpleudf"))

(defn simpleudf
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' simpleudf project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))

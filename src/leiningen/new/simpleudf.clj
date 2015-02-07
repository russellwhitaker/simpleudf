(ns leiningen.new.simpleudf
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "simpleudf"))

(defn simpleudf
  "Generate a new project based on the 'simpleudf' template"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :class-name (clojure.string/capitalize name)}]
    (main/info (format "Generating fresh 'lein new' simpleudf project '%s'." name))
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["spec/{{sanitized}}/core_spec.clj" (render "spec/core_spec.clj" data)]
             ["src/{{sanitized}}/hive/udf/{{class-name}}.clj" (render "hive/udf/UDFClassName.clj" data)]
             ["README.md" (render "../README.md" data)]
             ["project.clj" (render "../project.clj" data)])))

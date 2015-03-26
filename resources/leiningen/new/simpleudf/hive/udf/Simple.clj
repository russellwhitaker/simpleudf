;;;
;;; Using this template:
;;;
;;; 1.) populate core.clj with your utility functions, replacing "hello-{{name}}" and "goodbye-{{name}}";
;;; 2.) replace "hello-{{name}}" and "goodbye-{{name}}" in the :require vector below with the utility functions
;;;       you need to make -evaluate do its job;
;;; 3.) implement the 'try' clause in the -evaluate function below;
;;; 4.) remove this commentary text.
;;;
;;; 0.) tests first!
;;;
(ns {{name}}.hive.udf.simple
  (:import [org.apache.hadoop.hive.ql.exec UDF]
           [org.apache.hadoop.io Text])
  (:require [{{name}}.core :refer [hello-{{name}} goodbye-{{name}}]])
  (:gen-class
   :name {{name}}.hive.udf.{{class-name}}
   :extends org.apache.hadoop.hive.ql.exec.UDF
   :methods [[evaluate [org.apache.hadoop.io.Text] org.apache.hadoop.io.Text]]))

(defn #^Text -evaluate
  "FIXME: describe here what your {{class-name}} UDF takes as input
   (usually a Hive string column value, which will be cast to Text) and emits
   as output (always a Hive Text object.)

   In the 'try' expression, below, implement your {{class-name}} UDF logic.

   Feel free to override the catch expression below as well, e.g. if you prefer
   to log exceptions to log4j or some other logging facility.
  "
  [this #^Text s]
  (when s
    (Text.
      (try
        ;;; FIXME: do something with input Text object 's' with functions you defined
        ;;;   in core.clj. Before all else: evaluate (.toString s) as your innermost expression,
        ;;;   then ensure your outermost expression returns a string (unless you have
        ;;;   a special need to pass the Text constructor a UTF8 byte array.)
        ;;;
        ;;; Do keep in mind that Java interop Clojure input type _hints_ - see "#^Text" in
        ;;;   this function's argument vector - are not type _casts_, so you're still
        ;;;   responsible for type safety.
        ;;;
        ;;; See: https://hadoop.apache.org/docs/current/api/org/apache/hadoop/io/Text.html
        ;;;
      (catch Exception e (str (.getMessage e) ": " (.toString s)))))))

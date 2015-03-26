(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "{{name}} wrapped with a Hive SimpleUDF"
  :url "http://yoururl.tld"
  :license {:name "Your licence type, e.g. 'The MIT License (MIT)'"
            :url "http://yourlicenseurl.tld"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.apache.hive/hive-exec "0.12.0"]
                 [org.apache.hive/hive-serde "0.12.0"]
                 [org.apache.hadoop/hadoop-core "1.2.1"]]
  :profiles {:dev {:dependencies [[speclj "3.2.0"]]}}
  :plugins [[speclj "3.2.0"]]
  :test-paths ["spec"]
  :main {{name}}.core
  :aot :all)

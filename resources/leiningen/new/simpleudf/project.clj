(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "{{name}} wrapped with an Apache Hive SimpleUDF"
  :url "http://yoururl.tld"
  :license {:name "Your licence type, e.g. 'The MIT License (MIT)'"
            :url "http://yourlicenseurl.tld"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.hive/hive-exec "2.1.1"]
                 [org.apache.hive/hive-serde "2.1.1"]
                 [org.apache.hadoop/hadoop-core "1.2.1"]]
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}}
  :plugins [[speclj "3.3.2"]]
  :test-paths ["spec"]
  :main {{name}}.core
  :aot :all)

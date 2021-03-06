(defproject cascalog-incanter "0.1.1-SNAPSHOT"
  :description "Incanter integration for Cascalog."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cascalog "1.8.5"]
                 [incanter/incanter-charts "1.3.0-SNAPSHOT"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [lein-multi "1.1.0-SNAPSHOT"]
                     [midje-cascalog "0.3.0"]]
  :multi-deps {"1.2" [[org.clojure/clojure "1.2.1"]
                      [cascalog "1.8.5"]
                      [incanter/incanter-charts "1.3.0-SNAPSHOT"]]
               "1.4" [[org.clojure/clojure "1.4.0-alpha3"]
                      [cascalog "1.8.5"]
                      [incanter/incanter-charts "1.3.0-SNAPSHOT"]]})

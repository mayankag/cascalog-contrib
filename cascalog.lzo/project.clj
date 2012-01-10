(defproject cascalog-lzo "0.1.0-wip"
  :description "Lzo compression taps for Cascalog."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cascalog "1.9.0-wip"]
                 [elephant-bird "2.1.3-SNAPSHOT"]
                 [hadoop-lzo "0.4.14"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [lein-multi "1.1.0-SNAPSHOT"]
                     [midje-cascalog "0.3.0"]]
  :multi-deps {"1.2" [[org.clojure/clojure "1.2.1"]
                      [cascalog "1.9.0-wip"]
                      [elephant-bird "2.1.3-SNAPSHOT"]
                      [hadoop-lzo "0.4.14"]
                      [hadoop-util "0.2.4"]]
               "1.4" [[org.clojure/clojure "1.4.0-alpha2"]
                      [cascalog "1.9.0-wip"]
                      [elephant-bird "2.1.3-SNAPSHOT"]
                      [hadoop-lzo "0.4.14"]
                      [hadoop-util "0.2.4"]]})

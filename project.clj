(defproject puppetlabs/stockpile "0.1.0-SNAPSHOT"
  :description "Simple, durable Clojure queuing library"
  :url "https://github.com/puppetlabs/stockpile"
  :license {:name "Apache License Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[puppetlabs/i18n "0.4.3"]
                 [org.clojure/clojure "1.8.0"]]
  :plugins [[puppetlabs/i18n "0.4.3"]]
  :profiles {:dev {:dependencies [[org.apache.commons/commons-lang3 "3.4"]]}}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]])

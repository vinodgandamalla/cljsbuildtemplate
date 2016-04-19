(defproject cljsbuildtemplate "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [compojure "1.4.0"]
                 [secretary "1.2.3"]

                 ;; Frontend dependencies
                 [org.clojure/clojurescript "1.7.170"]
                 [hiccup "1.0.5"]
                 [prismatic/dommy "1.1.0"]
                 [ring/ring-core "1.4.0" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-servlet "1.4.0" :exclusions [javax.servlet/servlet-api]]
                 [ring/ring-defaults "0.1.5" :exclusions [javax.servlet/servlet-api]]
                 [cc.qbits/jet "0.7.1"]
                 [clj-time "0.11.0"]
                 [bouncer "1.0.0"]
                 [reagent "0.5.1"]
                 ]
  :source-paths ["src/clj"]
  :main cljsbuildtemplate.core
  :plugins [
            [lein-ring "0.8.13"]
            [migratus-lein "0.1.7"]
            [lein-cljsbuild "1.1.2"]
            ]
  :cljsbuild {:builds
              [{:id "app"
                :source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/js/app.js"
                           :output-dir "resources/public/js/out"
                           :source-map true
                           :optimizations :none
                           :asset-path "/static/js/out"
                           :main "cljsbuildtemplate.core"
                           :pretty-print true}}]})

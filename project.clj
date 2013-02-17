(defproject codewrx "0.1.0-SNAPSHOT"
  :description "Experimental Clojar Code Hacking"
  :url "http://6thcolumn.org/"
  :license {:name "6th Column BSD-2 License"
            :url "http://www.6thcolumn.org/LICENSE"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [net.sf.ehcache/ehcache "2.3.1" :extension "pom"]]
  :offline? true
  :source-paths ["src/clojure/main"]
  :test-paths ["test/clojure/main"]
  :resource-paths ["etc"]
  :compile-path "build"
  :target-path "dist"
  :omit-source true
  :jar-exclusions [#"(?:^|/).git/"]
  :aot [org.sixthcolumn.core]
  :main org.sixthcolumn.core
  :jar-name "codewrx-experimental.jar"
  :uberjar-name "codewrx-experimental-all.jar"
  :manifest {"Organization" "${organization}"
             "Author" "${author}"
             "Project" "${project_name}"
             "Module" "${module}"
             "Version" "${version}"
             "Branch" "${branch}"
             "Commit" "${commit}"}
             "Release-Name" "${release_name}"
  :javac-options ["-target" "1.6" "source" "1.6" "-Xlint:-options"]
  :mailing-list {:name "developers list"
                 :post "codewrx-devel@6thcolumn.org"
                 :subscribe "codewrx-subscribe@lists.6thcolumn.org"
                 :unsubscribe "codewrx-unsubscribe@lists.6thcolumn.org"}
  :scm {:name "git"})

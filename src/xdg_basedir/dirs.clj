(ns xdg-basedir.dirs)

(defn- get-environment [key alternative]
  (let [environment (System/getenv key)]
    (if (and environment (not (empty? environment)))
      environment alternative)))

(defn- split-list [string]
  (clojure.string/split string #":"))

(def home (System/getenv "HOME"))

(def xdg-data-home (get-environment "XDG_DATA_HOME"
                                    (str home "/.local/share")))
(def xdg-config-home (get-environment "XDG_CONFIG_HOME"
                                      (str home "/.config")))
(def xdg-cache-home (get-environment "XDG_CACHE_HOME"
                                     (str home "/.cache")))

(def xdg-data-dirs (split-list
                     (get-environment "XDG_DATA_DIRS"
                                      "/usr/local/share/:/usr/share/")))
(def xdg-config-dirs (split-list
                       (get-environment "XDG_CONFIG_DIRS"
                                        "/etc/xdg")))

(def xdg-runtime-dir (get-environment "XDG_RUNTIME_DIR"
                                      nil))

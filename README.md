# xdg-basedir

This library provides variables for paths in the XDG Base Directory Specification.

The specification can be found at http://standards.freedesktop.org/basedir-spec/basedir-spec-latest.html

## Leiningen

[![Clojars Project](http://clojars.org/xdg-basedir/latest-version.svg)](http://clojars.org/xdg-basedir)

## Examples

```clj
(require '[xdg-basedir.dirs :as dirs])

dirs/xdg-data-home
	"/home/johannes/.local/share"

dirs/xdg-config-home
	"/home/johannes/.config"

dirs/xdg-cache-home
	"/home/johannes/.cache"

dirs/xdg-data-dirs
	["/usr/local/share/" "/usr/share/"]

dirs/xdg-config-dirs
	["/etc/xdg"]

dirs/xdg-runtime-dir
	"/run/user/1000"
```

## License

Copyright © 2015 Johannes Knödtel

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

# 0196 — Error Wrapping

Wrap an inner error "inner" inside an outer context and print the combined message `outer: inner`. Groovy wraps via the `Throwable` cause constructor and reads `.cause`.

## Run

    groovy main.groovy

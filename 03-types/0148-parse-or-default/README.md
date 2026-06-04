# 0148 — Parse or Default

Parse "42" to 42 and "x" (invalid) to a default 0, printing `42 0`. Groovy wraps `Integer.parseInt` in a try/catch, returning the default on `NumberFormatException`.

## Run

    groovy main.groovy

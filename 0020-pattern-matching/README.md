# 0020 — Pattern Matching

Match `n` against the literal patterns `1` and `2` with a wildcard fallback, mapping `1`, `2`, and `5` to `one`, `two`, and `many`. Groovy's `switch` is far more flexible than Java's: each `case` uses the `isCase` operator, so cases can be values, ranges, regexes, types, or closures. Here plain integer literals match and `default` is the fallback; the explicit `return` in each arm avoids fall-through.

## Run

    groovy main.groovy

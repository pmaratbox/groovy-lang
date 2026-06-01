# 0038 — String Methods

Split `"a,b,c"` on commas, upper-case each part, and join them with `-`, printing `A-B-C`. `split(",")` returns a `String[]`, `collect` maps `toUpperCase()` over it, and `join("-")` reassembles. Groovy adds many helpers (`tokenize`, `padLeft`, `*.toUpperCase()`) on top of Java's `String`.

## Run

    groovy main.groovy

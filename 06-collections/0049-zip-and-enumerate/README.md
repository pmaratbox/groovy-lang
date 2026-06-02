# 0049 — Zip & Enumerate

Pair the letters `a, b, c` with the numbers `1, 2, 3` position by position, formatting each pair as `key=value` and printing `a=1 b=2 c=3`. `[a, b].transpose()` is Groovy's zip — it turns two equal-length lists into a list of pairs — which `collect` then formats. Its enumerate counterpart, `eachWithIndex`, pairs items with their index.

## Run

    groovy main.groovy

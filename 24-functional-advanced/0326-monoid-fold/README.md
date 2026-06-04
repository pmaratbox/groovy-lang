# 0326 — Monoid Fold

Fold lists under two monoids: string concat ["a","b","c"]->"abc" and integer sum [1,2,3]->6, printing `abc 6`. A single `inject`-based fold takes the monoid's identity and combine op, so it works for any element type.

## Run

    groovy main.groovy

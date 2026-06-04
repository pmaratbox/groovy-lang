# 0322 — Lazy Filter + Take

From a lazy stream of naturals, filter the even ones and take three, printing `2 4 6`. Each pull from the generator advances until the even predicate holds, so only the demanded values are produced.

## Run

    groovy main.groovy

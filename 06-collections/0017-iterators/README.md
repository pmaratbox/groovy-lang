# 0017 — Iterators

Take the numbers 1 through 5, keep the even ones, double each, and add them up — a filter, then a map, then a reduce — printing the final sum. Groovy names these collection methods `findAll` (filter), `collect` (map), and `sum` (a built-in reduce), and `it` is the implicit single parameter of each closure. The chain returns plain `ArrayList`s at each step, and `sum()` folds the final list into one number.

## Run

    groovy main.groovy

# 0044 — Generic Constraints

Write a generic `largest(a, b)` that requires an ordered type, then call it on integers (3 and 9) and on strings (apple and pear), printing `9` and `pear`. Groovy is dynamically typed, so `largest` needs no type parameter; `>` dispatches to `Comparable.compareTo` at runtime. Optional Java-style generic bounds (`<T extends Comparable<T>>`) can be added for static checking.

## Run

    groovy main.groovy

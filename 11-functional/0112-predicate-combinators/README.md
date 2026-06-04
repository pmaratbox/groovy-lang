# 0112 — Predicate Combinators

Combine predicates with AND/OR/NOT: test `isEven AND isPositive` on 4 (yes) and -4 (no), printing `yes no`. A combinator closure takes two predicate closures and returns a new closure forming their conjunction.

## Run

    groovy main.groovy

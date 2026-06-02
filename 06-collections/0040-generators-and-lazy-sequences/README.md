# 0040 — Generators & Lazy Sequences

Produce an endless lazy sequence of squares and take only the first three, printing `1 4 9`. Groovy has no generator syntax, so it borrows Java's lazy `Stream`: `Stream.iterate(1, n -> n + 1)` is an infinite stream, `map` squares each element, and `limit(3)` takes the first three before `toList` forces them.

## Run

    groovy main.groovy

# 0021 — Mutability & References

Have a function increment a value in place — through a pointer, reference, or mutable holder — so the caller sees it change from `before: 1` to `after: 2`. On the JVM, Groovy passes object references by value; the `List` is shared, so `box[0] += 1` is visible to the caller. A bare number is immutable, so a mutable container carries the change back out.

## Run

    groovy main.groovy

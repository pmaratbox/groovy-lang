# 0043 — Function Composition

Compose `inc` (add one) and `twice` (multiply by two) into one function and apply it to `3`, so `inc(twice(3))` prints `7`. Groovy closures compose directly: `{ f, g -> { x -> f(g(x)) } }` returns a closure that runs `g` then `f`. Closures are objects, so they can be stored, passed, and returned.

## Run

    groovy main.groovy

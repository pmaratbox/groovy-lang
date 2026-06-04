# 0110 — Currying

Curry a two-argument add into a chain of one-argument functions and call it as `add(2)(3)`, printing `5`. In Groovy a closure can return another closure that captures the first argument, so `add(2)(3)` chains two single-argument calls.

## Run

    groovy main.groovy

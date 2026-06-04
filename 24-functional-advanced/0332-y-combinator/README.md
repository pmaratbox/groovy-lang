# 0332 — Y Combinator

Define factorial via a fixed-point combinator (no named self-recursion) and compute 5!, printing `120`. A `fix` closure feeds a non-recursive generator its own fixpoint, so the factorial body never refers to itself by name.

## Run

    groovy main.groovy

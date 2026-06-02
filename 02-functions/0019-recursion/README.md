# 0019 — Recursion

Define a recursive `factorial(n)` that multiplies `n` by `factorial(n - 1)` until it bottoms out at `1`, then print `factorial(5) = 120`. A method defined at script scope can call itself by name, and the `?:` ternary keeps the base case and recursive case on one line. Groovy runs on the JVM, which performs no tail-call optimization, so depth is bounded by the stack.

## Run

    groovy main.groovy

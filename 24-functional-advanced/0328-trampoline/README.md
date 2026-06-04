# 0328 — Trampoline

Sum 1..100 with a trampolined recursion that avoids deep stacks, printing `5050`. Groovy's built-in `Closure.trampoline` returns thunks that a driver loop executes, keeping the stack flat.

## Run

    groovy main.groovy

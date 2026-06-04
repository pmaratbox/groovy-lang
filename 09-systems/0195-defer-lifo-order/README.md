# 0195 — Defer LIFO Order

Register three deferred actions printing 1, 2, 3 and show they run in last-in-first-out order `3 2 1`. Groovy lacks `defer`, so a stack of closures is drained in reverse.

## Run

    groovy main.groovy

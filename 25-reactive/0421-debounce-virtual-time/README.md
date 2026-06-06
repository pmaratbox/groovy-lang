# 0421 — Debounce (Virtual Time)

Implement debounce(window) on a virtual-time scheduler: emit a value only after a quiet gap of `window` ticks with no newer value. In Groovy a closure-based scheduler with a spaceship-sorted event list keeps timed operators fully deterministic.

## Run

    groovy main.groovy

# 0422 — Throttle (Virtual Time)

Implement throttle(window) (leading edge) on a virtual-time scheduler: emit a value, then suppress further values for `window` ticks. Groovy closures model observers as `[next: { ... }]` maps wired through a priority-ordered task list.

## Run

    groovy main.groovy

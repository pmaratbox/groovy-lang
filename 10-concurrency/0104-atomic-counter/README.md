# 0104 — Atomic Counter

Increment a shared atomic counter from multiple threads 1000 times total without a lock, printing `1000`. Groovy reuses `java.util.concurrent.atomic.AtomicInteger` whose `incrementAndGet()` is lock-free.

## Run

    groovy main.groovy

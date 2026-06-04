# 0380 — Compare-And-Swap Loop

Increment a shared value to 100 using a CAS retry loop from multiple threads, printing `100`. Groovy reuses `AtomicInteger.compareAndSet` inside a `while` retry loop.

## Run

    groovy main.groovy

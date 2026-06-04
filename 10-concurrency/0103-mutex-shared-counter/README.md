# 0103 — Mutex-Protected Counter

Have multiple threads each increment a shared counter under a mutex so the total is exactly `1000`. Groovy uses a `synchronized (lock)` block around each increment to serialize the 10 threads.

## Run

    groovy main.groovy

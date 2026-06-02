# 0022 — Concurrency

Start two tasks that produce `1` and `2`, let them run concurrently, then join their results and print `sum: 3`. On the JVM, `Thread.start { ... }` spawns a real thread running the closure and returns it, and `join()` waits for completion; results are written into a shared list. Groovy can also use Java's `java.util.concurrent` and the GPars library for higher-level concurrency.

## Run

    groovy main.groovy

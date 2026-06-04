# 0101 — Threads: Spawn and Join

Spawn 3 worker threads, wait for all of them to finish, then print `done: 3`. Groovy's `Thread.start` spawns a real JVM thread and the spread operator `*.join()` waits for all of them.

## Run

    groovy main.groovy

# 0378 — Barrier Synchronization

Have 3 threads each arrive at a barrier before any proceeds, then print `all reached: 3`. Groovy reuses `java.util.concurrent.CyclicBarrier` to rendezvous the threads.

## Run

    groovy main.groovy

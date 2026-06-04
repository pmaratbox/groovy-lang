# 0382 — Fork-Join Sum

Recursively fork the sum of [1..8] into halves and join the partial sums, printing `36`. Groovy spawns a thread per half with `Thread.start` and `join`s the recursive results.

## Run

    groovy main.groovy

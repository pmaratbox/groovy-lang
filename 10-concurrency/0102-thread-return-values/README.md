# 0102 — Threads Returning Values

Run two threads that compute the squares of 3 and 4, join them, and print the sum of their results `25`. Each `Thread.start` closure writes into a shared results array that main reads after `join()`.

## Run

    groovy main.groovy

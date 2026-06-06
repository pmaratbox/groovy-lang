# 0408 — Take Operator

Implement take(n) over an unbounded source of the natural numbers, emitting the first 3 then completing (and unsubscribing the source). The source loop checks the Subscription's closed flag each iteration, so unsubscribing halts the infinite stream.

## Run

    groovy main.groovy

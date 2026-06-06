# 0402 — Observer Contract

Demonstrate the observer contract next*-then-terminal: emit 1 and 2, complete, and show that a post-complete next is ignored. Groovy closures supply the next/error/complete handlers wrapped by a small SafeObserver class guarding a stopped flag.

## Run

    groovy main.groovy

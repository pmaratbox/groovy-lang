# 0403 — Subscribe and Unsubscribe

Return a Subscription from subscribe() and use it to unsubscribe so later values are not delivered. In Groovy the observer is a map of closures and the producer checks the Subscription's closed flag before each emission.

## Run

    groovy main.groovy

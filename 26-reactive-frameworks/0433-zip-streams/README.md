# 0433 — Zip Streams

Use the library's zip operator to pair two streams by index and combine each pair as a+b. Built with RxJava 3's `Observable.zip` operator, combining each indexed pair via a `(x, y) -> x + y` combiner.

## Run

    groovy main.groovy

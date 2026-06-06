# 0434 — FlatMap (mergeMap)

Use the library's flatMap/mergeMap on a virtual/test scheduler, mapping each outer value to a timed inner stream and merging them. Uses RxJava 3's `Observable.flatMap` with a `TestScheduler` to deterministically merge the timed inner observables.

## Run

    groovy main.groovy

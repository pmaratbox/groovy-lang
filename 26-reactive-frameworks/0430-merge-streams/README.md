# 0430 — Merge Streams

Use the library's merge operator on a virtual/test scheduler to interleave two timed streams by emission time. Built with RxJava 3 using `Observable.merge` over `Observable.timer` on a `TestScheduler`.

## Run

    groovy main.groovy

# 0436 — Debounce (Virtual Time)

Use the library's debounce operator on a virtual/test scheduler to emit a value only after a quiet window. Uses RxJava 3 `Observable.debounce` driven by a `TestScheduler` so virtual time is fully deterministic.

## Run

    groovy main.groovy

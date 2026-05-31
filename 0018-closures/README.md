# 0018 — Closures

Build a counter that captures a private count starting at zero; each call to the returned function increments the count and returns it, so calling it twice prints 1 then 2. Groovy's `{ -> ... }` is a `Closure` object, a first-class value that captures surrounding locals by reference — so the returned closure can read and mutate `count` even after `makeCounter` returns. The `->` with no parameters marks a zero-argument closure, and the last expression is its return value.

## Run

    groovy main.groovy

# 0024 — Sorting & Comparators

Sort `[3, 1, 2]` ascending, then again with a custom comparator that reverses the order, printing `asc: 1 2 3` and `desc: 3 2 1`. `list.sort(false)` returns a new sorted list (passing `true`, the default, sorts in place); supplying a closure `{ a, b -> b <=> a }` uses the spaceship operator `<=>` as the comparator. Groovy sorts naturally ordered elements without one.

## Run

    groovy main.groovy

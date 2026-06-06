# 0428 — Scan (Running Fold)

Use the library's scan operator to emit the running sum of 1, 2, 3, 4. Uses RxJava 3's scan(seed, accumulator); since scan emits the seed first, skip(1) drops it.

## Run

    groovy main.groovy

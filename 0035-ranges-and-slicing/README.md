# 0035 — Ranges & Slicing

From the list `[10, 20, 30, 40, 50]`, take the sub-sequence at indices 1 through 4 (exclusive) and print `slice: 20 30 40`. Groovy indexes with *inclusive* ranges, so `nums[1..3]` selects indices 1, 2, and 3; a half-open range is written `nums[1..<4]`. The result is a new list, and negative endpoints count from the end.

## Run

    groovy main.groovy

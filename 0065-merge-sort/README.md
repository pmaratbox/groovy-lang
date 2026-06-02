# 0065 — Merge Sort

Sort the list `3, 1, 4, 1, 5, 2` using merge sort (recursively split in half, then merge the sorted halves) and print the result: `1 1 2 3 4 5`. `mergeSort` slices with ranges (`items[0..<mid]`) and recurses; `merge` drains the smaller front element from each half.

## Run

    groovy main.groovy

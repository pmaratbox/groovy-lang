# 0327 — FlatMap

FlatMap [1,2,3] with x -> [x, x*10] and print the flattened result `1 10 2 20 3 30`. Groovy's `collectMany` maps each element to a list and concatenates the results in one step.

## Run

    groovy main.groovy

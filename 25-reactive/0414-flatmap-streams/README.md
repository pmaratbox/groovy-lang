# 0414 — FlatMap (mergeMap)

Implement flatMap/mergeMap: map each outer value to an inner timed stream and merge all inners concurrently (no cancellation). Groovy closures model observers as maps with `next`, and a list-backed priority queue gives the virtual scheduler.

## Run

    groovy main.groovy

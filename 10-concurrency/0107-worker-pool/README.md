# 0107 — Worker Pool

Distribute squaring of 1..4 across a pool of workers, collect the results, and print them sorted ascending `1 4 9 16`. Groovy submits `Callable` tasks to a fixed `Executors` thread pool and sorts the gathered futures.

## Run

    groovy main.groovy

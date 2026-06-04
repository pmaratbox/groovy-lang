# 0108 — Parallel Tasks Combined

Run two independent tasks that produce 10 and 20 concurrently, then combine (sum) their results into `30`. Groovy uses `CompletableFuture.supplyAsync` and `thenCombine` to join the two async results.

## Run

    groovy main.groovy

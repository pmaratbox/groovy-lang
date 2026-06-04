# 0106 — Producer / Consumer

A producer sends 1..5 to a consumer that sums them, printing `15`. Groovy uses a bounded `ArrayBlockingQueue` so the producer blocks when the buffer is full.

## Run

    groovy main.groovy

# 0105 — Channels / Message Passing

Send the values 1, 2, 3 through a channel (or queue) from one thread and receive them in order, printing `1 2 3`. Groovy models the channel with a `LinkedBlockingQueue` plus a sentinel value to signal close.

## Run

    groovy main.groovy

# 0303 — Prim MST

Compute the MST total weight of the chain (0,1,1),(1,2,2),(2,3,3) with Prim, printing `6`. Groovy's `PriorityQueue` over `[weight, node]` lists grows the tree by the cheapest crossing edge.

## Run

    groovy main.groovy

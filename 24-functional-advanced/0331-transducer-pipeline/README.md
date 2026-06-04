# 0331 — Transducer Pipeline

Compose map(+1) with filter(even) and run it over [1,2,3,4], printing `2 4`. Each transducer is a reducer-transforming closure, and composing them builds one pass that increments then keeps evens.

## Run

    groovy main.groovy

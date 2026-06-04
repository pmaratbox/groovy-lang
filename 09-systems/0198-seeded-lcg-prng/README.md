# 0198 — Seeded LCG PRNG

Implement a linear congruential generator next=(5*x+3) mod 16 seeded at 1 and print its first 3 outputs `8 11 10`. A plain `collect` over a range mutates the state deterministically without any built-in RNG.

## Run

    groovy main.groovy

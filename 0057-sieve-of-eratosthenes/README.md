# 0057 — Sieve of Eratosthenes

Use the Sieve of Eratosthenes to find every prime number up to `10` and print them: `2 3 5 7`. `(0..n).collect { true }` builds the flag list; multiples of each prime are struck from `i*i`, and `findAll` keeps the indices still marked prime.

## Run

    groovy main.groovy

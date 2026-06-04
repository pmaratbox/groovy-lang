# 0266 — DFA: Divisible by 3

Use a 3-state DFA over binary input to test whether "110" (6, yes) and "100" (4, no) are divisible by 3, printing `yes no`. The state is just the running value mod 3, updated bit by bit in a Groovy closure.

## Run

    groovy main.groovy

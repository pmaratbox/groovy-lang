# 0070 — Digit Sum

Sum the decimal digits of `1234` (repeatedly take the last digit with `% 10` and drop it with `/ 10`) and print the total: `10`. `n % 10` peels the last digit and `n.intdiv(10)` does the integer division that drops it.

## Run

    groovy main.groovy

# 0030 — Variadic Functions

Define a function that accepts a variable number of integer arguments and returns their total, then call it with `1, 2, 3` to print `sum: 6`. A trailing `int... nums` parameter receives the extra arguments as an array, and Groovy's `.sum()` adds them up. Internally this is Java varargs, so an array can be passed directly too.

## Run

    groovy main.groovy

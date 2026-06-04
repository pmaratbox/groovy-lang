# 0272 — Glob Star Match

Match the glob "a*b" (* = any run) against "aaab" (yes) and "aac" (no), printing `yes no`. A recursive Groovy closure backtracks the `*` over zero or more characters.

## Run

    groovy main.groovy

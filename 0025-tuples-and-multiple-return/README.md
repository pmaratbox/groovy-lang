# 0025 — Tuples & Multiple Return

Return both the smaller and larger of `3` and `7` from one function, unpacking the pair to print `min: 3` and `max: 7`. Groovy returns the pair as a `List` and uses multiple assignment `def (lo, hi) = ...` to unpack it positionally. Extra targets bind to `null` and missing ones are ignored, so the list and target counts need not match.

## Run

    groovy main.groovy

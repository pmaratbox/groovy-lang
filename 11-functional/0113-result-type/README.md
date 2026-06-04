# 0113 — Result / Either Type

Model success and failure with a Result type: safeDiv(10,2) prints `ok: 5` and safeDiv(1,0) prints `err: divide by zero`. Groovy maps model the Ok/Err variants with a `tag`, and the truthy ternary picks the branch to print.

## Run

    groovy main.groovy

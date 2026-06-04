# 0116 — Function Pipeline

Compose inc, double, and negate into a left-to-right pipeline and apply it to 3: ((3+1)*2) negated = `-8`. Groovy's `>>` operator composes closures left-to-right, feeding each result into the next.

## Run

    groovy main.groovy

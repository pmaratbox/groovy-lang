# 0214 — Visitor

Use a visitor to sum the values of a small node tree with leaves 1, 2, 3, printing `6`. Double dispatch via `accept`/`visit` lets the `SumVisitor` accumulate each node's value.

## Run

    groovy main.groovy

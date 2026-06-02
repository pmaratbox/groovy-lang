# 0037 — Operator Overloading

Define how `+` (or an `add` method) combines two points, then add `(1, 2)` and `(3, 4)` and print `(4, 6)`. Groovy maps operators to methods, so defining `plus(Point)` makes `+` work on `Point` (likewise `minus`, `multiply`, `equals`). The map-style constructor (`new Point(x: 1, y: 2)`) comes for free.

## Run

    groovy main.groovy

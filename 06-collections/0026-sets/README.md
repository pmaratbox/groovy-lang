# 0026 — Sets

Build a set from `1, 2, 2, 3` so the duplicate collapses, then print its `size: 3` and whether it contains `2` (`has 2: yes`) and `5` (`has 5: no`). `[1, 2, 2, 3] as Set` coerces the list into a `LinkedHashSet`, dropping duplicates; `.size()` counts and `.contains` tests membership. The list literal `[...]` is the building block, and the `as Set` cast makes it a set.

## Run

    groovy main.groovy

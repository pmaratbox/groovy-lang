# 0047 — Immutable Update (Copy-with)

Make a copy of the point `(1, 2)` with its `x` changed to `9`, leaving the original intact, and print `original: (1, 2)` then `updated: (9, 2)`. `@Immutable(copyWith = true)` generates a `copyWith(Map)` method that returns a new instance with the named fields replaced; the original immutable object is left intact.

## Run

    groovy main.groovy

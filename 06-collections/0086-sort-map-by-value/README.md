# 0086 — Sort a Map by Value

Sort the map `{a: 3, b: 1, c: 2}` by value in ascending order and print the entries: `b:1 c:2 a:3`. `Map.sort { it.value }` returns a new map ordered by value; `collect` formats each entry.

## Run

    groovy main.groovy

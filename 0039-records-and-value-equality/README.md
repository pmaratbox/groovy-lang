# 0039 — Records & Value Equality

Create two points with the same fields, print one as `point: (1, 2)`, and compare them by value to print `equal: yes`. A Groovy `record` (since Groovy 4) auto-generates a value-based `equals`/`hashCode`, a canonical constructor, and immutable components, so `==` (which calls `equals` in Groovy) reports the points equal.

## Run

    groovy main.groovy

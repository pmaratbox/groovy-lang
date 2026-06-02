# 0045 — Abstract Classes & Methods

Define an abstract `Shape` with an abstract `area` and a concrete `describe` that uses it, then implement a `Square` of side 3 and print `area: 9`. On the JVM, an `abstract class` with an `abstract` method can hold both unimplemented and concrete methods; `Square` must supply `area`, and `describe` is inherited and calls it.

## Run

    groovy main.groovy

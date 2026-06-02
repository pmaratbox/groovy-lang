# 0016 — Generics

Define a generic `first` function that returns the first element of a list, then call it on a list of integers and a list of strings to show one definition working at two types. Groovy is dynamically typed, so `def first(items)` alone would already work on any list; the `<T> T first(List<T> items)` form adds Java-style generic types as optional documentation and tooling support. At runtime the type parameter is erased, exactly as on the JVM, and dispatch is dynamic regardless.

## Run

    groovy main.groovy

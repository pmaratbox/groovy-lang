# 0033 — Custom Error Types

Define a custom error, raise it from a `check` that rejects values over `100`, catch it for the input `200`, and print `error: value too large`. A custom exception subclasses `Exception` (or `RuntimeException`) and chains its message through `super(message)`; `throw`/`try`/`catch` work as in Java, and `e.message` reads the property. Groovy catches are unchecked.

## Run

    groovy main.groovy

# 0015 — Interfaces

Define a `Shape` interface with `name()` and `area()` methods, implement it for a rectangle and a square, then loop over a collection of shapes and print each one's area. Groovy inherits Java's `interface` and `implements`, so the contract is declared explicitly, while each class gets a no-arg map constructor for free — `new Rectangle(width: 3, height: 4)` sets the fields by name. Being dynamic, Groovy would also dispatch on the methods without the `implements` clause, but declaring it documents the contract.

## Run

    groovy main.groovy

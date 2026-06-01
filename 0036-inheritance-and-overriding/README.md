# 0036 — Inheritance & Overriding

Define a base `Animal` with a `speak` method, a `Dog` that overrides it, and call both, printing `animal: some sound` and `dog: Woof`. `class Dog extends Animal` and a same-signature method override it, exactly as on the JVM. Groovy dispatches dynamically by default, so even untyped references call the most-derived `speak`.

## Run

    groovy main.groovy

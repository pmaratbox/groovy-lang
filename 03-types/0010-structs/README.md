# 0010 — Structs

Define a `Person` class with a `name` and an `age`, create one ("Ada", 36), and
print each field. Groovy auto-generates getters, setters, and a no-arg
constructor, and supports the named-argument (map) constructor
`new Person(name: "Ada", age: 36)`. Annotations like `@Immutable` / `@Canonical`
add record-style equality and a tuple constructor.

## Run

    groovy main.groovy

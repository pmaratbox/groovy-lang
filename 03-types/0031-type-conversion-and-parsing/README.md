# 0031 — Type Conversion & Parsing

Parse the string `"42"` into an integer and `"3.5"` into a float, then convert the integer back to a string, printing `int: 42`, `float: 3.5`, and `str: 42`. Groovy adds conversion methods to `String`: `"42".toInteger()` and `"3.5".toDouble()`, with `.toString()` for the reverse. The `as` operator (`"42" as Integer`) and Java's `Integer.parseInt` work too.

## Run

    groovy main.groovy

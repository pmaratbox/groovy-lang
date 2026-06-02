# 0032 — Math Functions

Take the square root of `16`, raise `2` to the 10th power, the absolute value of `-5`, and the larger of `3` and `9`, printing `sqrt: 4`, `pow: 1024`, `abs: 5`, and `max: 9`. Groovy calls Java's `java.lang.Math`: `Math.sqrt` and `Math.pow` return `double`s (cast to `int` here), while `Math.abs` and `Math.max` have integer overloads. Groovy also adds a `**` power operator, which returns an `Integer` here and only widens to `BigInteger` if the result overflows.

## Run

    groovy main.groovy

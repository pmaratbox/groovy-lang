# 0014 — Higher-Order Functions

Write `apply(f, x)` that calls `f` on `x`, then pass it two different functions,
`inc` and `double`. Groovy's first-class function values are `Closure`s, written
`{ x -> x + 1 }`. (The doubling closure is named `dbl` because `double` is a
reserved type keyword.)

## Run

    groovy main.groovy

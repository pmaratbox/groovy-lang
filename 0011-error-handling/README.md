# 0011 — Error Handling

Write a `divide(a, b)` that throws on a zero divisor, then call it on `10 / 2`
(prints the result) and `10 / 0` (prints an error). Groovy uses Java-style
**exceptions** (`throw` / `try` / `catch`). `a.intdiv(b)` is integer division;
the bare `/` operator would produce a `BigDecimal`.

## Run

    groovy main.groovy

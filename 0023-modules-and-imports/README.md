# 0023 — Modules & Imports

Define `square(n)` in a separate `mathutil` module and import it from the main program, printing `square(8) = 64` across the module boundary. A `.groovy` file with a class compiles to a class of that name; `groovy main.groovy` puts sibling sources on the classpath, so `MathUtil.square` resolves without an explicit import (same default package). Groovy auto-imports `java.lang`, `java.util`, and a few others.

## Run

    groovy main.groovy

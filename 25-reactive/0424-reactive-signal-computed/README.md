# 0424 — Signal + Computed

Implement fine-grained reactivity: a writable signal and a derived computed that recomputes when its dependency changes. Groovy closures capture the signals and register as subscribers so the computed re-evaluates on write.

## Run

    groovy main.groovy

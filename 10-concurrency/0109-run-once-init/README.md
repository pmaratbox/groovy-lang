# 0109 — Run-Once Initialization

Ensure an initializer runs exactly once even when several threads race to trigger it, printing `init count: 1`. Groovy guards a `done` flag inside a `synchronized` block so only the first racing thread runs the init body.

## Run

    groovy main.groovy

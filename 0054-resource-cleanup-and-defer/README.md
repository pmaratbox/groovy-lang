# 0054 — Resource Cleanup & Defer

Acquire a resource, use it, and let the language release it automatically at scope exit, printing `open`, `use`, and `close` in that order. `withCloseable` calls `close()` automatically when the closure returns — Groovy's take on Java's try-with-resources, for any `Closeable`.

## Run

    groovy main.groovy

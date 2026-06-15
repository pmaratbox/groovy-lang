# 0483 — Default value

Groovy's built-in `groovy.text.SimpleTemplateEngine` renders a `${...}`
expression that supplies a fallback with the Elvis operator `?:`. The binding
holds no `name` key, so `binding.variables.get("name")` is `null` and the
template falls back to `anonymous` — the engine's idiomatic default mechanism.

## Run

    groovy main.groovy

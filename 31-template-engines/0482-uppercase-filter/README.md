# 0482 — Uppercase filter

Uses Groovy's built-in `groovy.text.SimpleTemplateEngine` to render a fixed
template against fixed data. There is no separate "uppercase filter" — Groovy's
`${...}` placeholders evaluate arbitrary Groovy expressions, so the uppercase
transform is just a method call: `${name.toUpperCase()}` with `name = 'alice'`
renders to `ALICE`.

## Run

    groovy main.groovy

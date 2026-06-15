# 0480 — Nested access

Groovy's built-in `groovy.text.SimpleTemplateEngine` renders a fixed template
against a fixed binding. The `${user.name}` placeholder uses Groovy's GString
property navigation to reach a nested field inside the map `[user: [name: 'alice']]`,
so the engine resolves `user.name` to `alice`.

## Run

    groovy main.groovy

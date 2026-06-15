# 0478 — Conditional

Render a template based on a condition using Groovy's `groovy.text.SimpleTemplateEngine`.
The template uses `<% %>` scriptlet blocks to embed a Groovy `if/else` on the
bound `logged_in` value: when true it emits `welcome`, otherwise `guest`. With
data `{logged_in: true}` the engine renders `welcome`.

## Run

    groovy main.groovy

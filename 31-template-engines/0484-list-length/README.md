# 0484 — List length

Uses Groovy's built-in `groovy.text.SimpleTemplateEngine` to render a fixed
template against fixed data. Groovy has no dedicated `length` filter — its
`${...}` placeholders evaluate arbitrary Groovy expressions, so the list size is
just a method call: `${items.size()}` with `items = [1, 2, 3]` renders to `3`.

## Run

    groovy main.groovy

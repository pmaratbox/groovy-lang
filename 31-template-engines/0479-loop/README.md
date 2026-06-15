# 0479 — Loop

Render a template with Groovy's built-in `groovy.text.SimpleTemplateEngine`,
using a `<% ... %>` scriptlet that calls `nums.each { ... }` to iterate the
list and emit `${n}` plus a newline per element. The loop logic lives in the
template itself, so the engine builds the multi-line output `1\n2\n3` from the
fixed data `nums=[1,2,3]`.

## Run

    groovy main.groovy

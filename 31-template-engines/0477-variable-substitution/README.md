# 0477 — Variable substitution

Groovy's built-in `groovy.text.SimpleTemplateEngine` parses a template string and
substitutes a `name` variable via `${...}` interpolation: `createTemplate(src)`
binds the data with `.make([name: 'alice'])`, and `.toString()` renders the result.

## Run

    groovy main.groovy

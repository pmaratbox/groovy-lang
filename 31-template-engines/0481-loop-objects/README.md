# 0481 — Loop over objects

Render a fixed template with Groovy's built-in `groovy.text.SimpleTemplateEngine`.
A `<% ... %>` scriptlet iterates `users` (a list of maps) with
`eachWithIndex`, emitting `${u.name}: ${u.age}` per entry and a newline
between entries — the scriptlet-loop + `${}` interpolation feature.

## Run

    groovy main.groovy

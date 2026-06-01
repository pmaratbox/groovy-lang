# 0042 — Environment Variables

Read the environment variable `LESSON_ENV_VAR`, falling back to `default` when it is unset, and print `value: default`. `System.getenv(name)` returns the value or `null` when unset, and Groovy's Elvis operator `?:` supplies the default. `System.getenv()` with no argument returns the whole map.

## Run

    groovy main.groovy

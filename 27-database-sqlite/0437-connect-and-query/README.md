# 0437 — Connect & query

Open an in-memory SQLite database and run a single query. Uses the real `org.xerial:sqlite-jdbc` driver (grabbed inline with `@Grab`) over raw JDBC: it opens a `jdbc:sqlite::memory:` connection, executes `select 42`, and prints the single integer result from the result set.

## Run

    groovy main.groovy

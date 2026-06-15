# 0443 — Order by & limit

Creates a `scores(value integer)` table in an in-memory SQLite database, inserts six values using a prepared statement, then runs `select value from scores order by value desc limit 3` to sort descending and take the top three rows, printing each value on its own line. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC.

## Run

    groovy main.groovy

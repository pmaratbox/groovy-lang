# 0439 — Parameterized query

Creates an in-memory SQLite database with a `users` table, inserts three rows, then runs `select name from users where id=?` with the value `2` supplied through a bound JDBC parameter (`PreparedStatement.setInt`) rather than string interpolation, printing the matched name. Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC.

## Run

    groovy main.groovy

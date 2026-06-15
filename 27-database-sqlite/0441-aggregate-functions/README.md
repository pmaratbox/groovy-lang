# 0441 — Aggregate functions

Creates an in-memory SQLite table of integer amounts (10, 20, 30, 40, 50) and runs a single `select count(*),sum(amount),min(amount),max(amount) from t` query, printing the four aggregate results each on its own line. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`java.sql.DriverManager` and prepared statements).

## Run

    groovy main.groovy

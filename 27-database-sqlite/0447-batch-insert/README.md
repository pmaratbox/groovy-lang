# 0447 — Batch insert

Insert 1000 rows (values 1..1000) into a SQLite in-memory table using a JDBC `PreparedStatement` with `addBatch`/`executeBatch` inside a single transaction (autocommit off, then commit), then `select count(*)` and print the resulting count. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC.

## Run

    groovy main.groovy

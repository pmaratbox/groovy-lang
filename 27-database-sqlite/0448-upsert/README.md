# 0448 — Upsert

Inserts a row into an in-memory SQLite table, then re-inserts the same primary key using an `insert ... on conflict(item) do update set qty=qty+excluded.qty` upsert (so the quantity accumulates), and finally upserts a brand-new key (which is inserted). Uses the real org.xerial sqlite-jdbc driver over raw JDBC with a prepared statement.

## Run

    groovy main.groovy

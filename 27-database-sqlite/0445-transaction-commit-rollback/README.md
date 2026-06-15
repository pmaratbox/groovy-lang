# 0445 — Transactions

Demonstrates real transaction control with the SQLite JDBC driver (`org.xerial:sqlite-jdbc`). After creating table `t`, it disables auto-commit, inserts 1 and 2 in one transaction and commits, then inserts 3 in a second transaction and rolls it back. A final `select n from t order by n` shows only 1 and 2, proving the rolled-back row is gone. Uses raw JDBC `Connection.setAutoCommit`, `commit`, and `rollback`.

## Run

    groovy main.groovy

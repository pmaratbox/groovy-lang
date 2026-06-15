# 0440 — Update & delete

Modify and remove rows, then read the result. This lesson inserts three users into an in-memory SQLite database, runs an `UPDATE` to rename one row and a `DELETE` to remove another, then selects the remaining rows ordered by id and prints each as `id name`. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `Statement`, and a `PreparedStatement` for parameter binding).

## Run

    groovy main.groovy

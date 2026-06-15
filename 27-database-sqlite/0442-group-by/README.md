# 0442 — Group by

Aggregate amounts per group. Creates an in-memory `sales` table, inserts category/amount rows via a prepared statement, then runs `select category,sum(amount) from sales group by category order by category` and prints each result as `category sum`. Uses the real `org.xerial:sqlite-jdbc` driver through raw JDBC.

## Run

    groovy main.groovy

# 0446 — Indexes

Creates a `products` table in an in-memory SQLite database, inserts three rows, then executes `create index idx_sku on products(sku)` to build a real index. A parameterized `select price from products where sku=?` bound to `'B'` uses the indexed column and prints the matching price (200). Uses the xerial sqlite-jdbc driver via raw JDBC.

## Run

    groovy main.groovy

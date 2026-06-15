# 0444 — Inner join

Joins two tables on a key. Creates in-memory `users` and `orders` tables, inserts rows via prepared statements, then runs `select u.name,o.item from orders o join users u on u.id=o.user_id order by u.name,o.item` and prints each result as `name item` (space-separated). Uses the real `org.xerial:sqlite-jdbc` driver through raw JDBC.

## Run

    groovy main.groovy

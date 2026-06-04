# 0330 — Lens Get/Set

Use a lens over the nested value {a:{b:1}} to get b (1) and to set b to 2, printing `1 2`. The lens is a pair of closures — a getter and an immutable setter that returns a fresh nested map.

## Run

    groovy main.groovy

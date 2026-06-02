# 0097 — Enums with Associated Values

Define a shape type carrying associated data — `Rect(2, 3)` and `Square(4)` — compute each area by matching on the variant, and print `6` and `16`. Groovy uses tagged maps; a `switch` on the `type` entry picks the variant and reads its data.

## Run

    groovy main.groovy

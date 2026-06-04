# 0117 — Fold Left vs Right

Fold subtraction over [1,2,3] from 0 both ways: left ((((0-1)-2)-3)) = -6 and right (1-(2-(3-0))) = 2, printing `-6 2`. Groovy's `.inject` is a left fold; reversing the list and flipping the operands simulates a right fold.

## Run

    groovy main.groovy

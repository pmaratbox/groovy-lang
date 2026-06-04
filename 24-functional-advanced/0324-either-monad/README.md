# 0324 — Either Monad

Chain Either computations: a successful divide chain yields 2, and a divide-by-zero yields an error, printing `2 err`. A `bind` closure propagates a Right value but passes a Left straight through, short-circuiting the rest of the chain.

## Run

    groovy main.groovy

# 0118 — Option Map Chaining

Map a function over a present optional (10 -> 12) and an absent one (-> fallback), printing `12 none`. Groovy uses `null` for absence, and the Elvis operator `?:` supplies the `none` fallback when mapping yields nothing.

## Run

    groovy main.groovy

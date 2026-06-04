# 0323 — Maybe Monad

Chain Maybe operations: Some(2) then +3 then *2 gives 10, and a None chain yields the fallback, printing `10 none`. A small map with a `bind` closure threads the optional value, short-circuiting on absence.

## Run

    groovy main.groovy

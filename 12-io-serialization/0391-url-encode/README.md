# 0391 — URL Percent-Encode

Percent-encode the string "a b&c" to `a%20b%26c`. Groovy maps each character, keeping unreserved ones and emitting uppercase hex escapes otherwise.

## Run

    groovy main.groovy

# 0346 — Newtype Wrapper

Wrap raw integers in distinct UserId and ProductId types so they cannot be confused, printing `user-1 prod-2`. Groovy `@Immutable` single-field classes give distinct value types whose `toString` formats each tag.

## Run

    groovy main.groovy

# 0013 — Optional

Hold one value that is present (`42`) and one that is absent, then print each
with a fallback of `-1` when absent. `Integer` is nullable (unlike the primitive
`int`). An explicit `!= null` check supplies the fallback — Groovy's Elvis
operator `?:` is *falsy*-based, so it would also replace a legitimate `0` (the
same pitfall as JavaScript's `||`).

## Run

    groovy main.groovy

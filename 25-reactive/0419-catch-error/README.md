# 0419 — Catch Error

Implement catchError that, on an error from the source, switches to a fallback stream. Groovy observers are plain maps of next/error/complete closures, so swapping streams is just resubscribing in the error handler.

## Run

    groovy main.groovy

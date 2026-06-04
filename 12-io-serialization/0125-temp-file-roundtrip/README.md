# 0125 — Temp File Roundtrip

Write a string to a temporary file, read it back, confirm it matches, delete the file, and print `roundtrip: ok`. Groovy's `File.createTempFile` plus the `.text` property make the roundtrip terse.

## Run

    groovy main.groovy

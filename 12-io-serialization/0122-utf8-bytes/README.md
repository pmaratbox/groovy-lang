# 0122 — UTF-8 Bytes

Print the UTF-8 byte values of "Hi": `72 105`. Groovy uses `String.getBytes("UTF-8")` and masks each signed byte with `& 0xFF`.

## Run

    groovy main.groovy

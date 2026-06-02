# 0073 — Caesar Cipher

Encrypt `abc` with a Caesar cipher shifting each letter forward by `1` (wrapping within the alphabet) and print the result: `bcd`. Each character is converted to its `int` code, shifted modulo 26 from the base `97` (`a`), and cast back to `char`.

## Run

    groovy main.groovy

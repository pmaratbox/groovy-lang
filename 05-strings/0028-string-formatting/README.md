# 0028 — String Formatting

Format the float `3.14159` to two decimals and zero-pad the integer `42` to width five, printing `pi: 3.14` and `id: 00042`. Groovy reuses Java's `printf`/`format` mini-language: `%.2f` fixes two decimals and `%05d` zero-pads to width 5. A `Locale` is passed (`Locale.US`) so the decimal mark is a dot regardless of the machine's locale.

## Run

    groovy main.groovy

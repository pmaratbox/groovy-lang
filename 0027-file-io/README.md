# 0027 — File I/O

Write `hello, file` to a file, read it back, delete the file, and print `read: hello, file`. Groovy decorates `java.io.File` with convenience properties: assigning `file.text` writes the whole file and reading `file.text` slurps it back, while `delete()` removes it. These wrap Java's streams and handle closing automatically.

## Run

    groovy main.groovy

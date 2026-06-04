# 0124 — Path Manipulation

Join "/tmp" and "file.txt", then take the basename and extension, printing `/tmp/file.txt file.txt .txt`. Groovy reuses `java.nio.file.Paths` and normalizes separators to "/".

## Run

    groovy main.groovy

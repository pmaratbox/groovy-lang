# 0041 — Command-line Arguments

Read the first command-line argument and greet it, so running with `Ada` prints `hello, Ada`. A Groovy script exposes its arguments as the implicit `args` array (the values after the script name), so `args[0]` is the first one. There is no program-name slot to skip.

## Run

    groovy main.groovy Ada

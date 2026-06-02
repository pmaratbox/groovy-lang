# 0059 — Group By

Group the words `one`, `two`, `three` by their length and print each length with its words, in ascending order of length: `3:[one,two] 5:[three]`. `groupBy { it.length() }` builds the length-to-words map in one call; its key set is sorted for ascending output.

## Run

    groovy main.groovy

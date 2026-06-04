def text = "a b\nc"
int words = text.split(/\s+/).findAll { it }.size()
int lines = text.split("\n", -1).size()
int chars = text.length()
println "$words $lines $chars"

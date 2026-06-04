def expr = "1 + 2"
def tokens = []
for (ch in expr) {
    if (ch.isInteger()) tokens << "NUM"
    else if (ch == "+") tokens << "PLUS"
}
println tokens.join(" ")

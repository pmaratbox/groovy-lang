def expr = "3 + 4 * 2"
def prec = ['+': 1, '-': 1, '*': 2, '/': 2]
def output = []
def ops = []
for (tok in expr.split(" ")) {
    if (tok in prec) {
        while (!ops.isEmpty() && prec[ops[-1]] >= prec[tok]) output << (ops.removeLast())
        ops << tok
    } else {
        output << tok
    }
}
while (!ops.isEmpty()) output << (ops.removeLast())
println output.join(" ")

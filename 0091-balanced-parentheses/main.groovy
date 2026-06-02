def isBalanced(s) {
    def stack = []
    for (ch in s) {
        if (ch == "(") stack.push(ch)
        else if (ch == ")") {
            if (stack.isEmpty()) return false
            stack.pop()
        }
    }
    return stack.isEmpty()
}

["(())", "(()"].each { s ->
    println(isBalanced(s) ? "yes" : "no")
}

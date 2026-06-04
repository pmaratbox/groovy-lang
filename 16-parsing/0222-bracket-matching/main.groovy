def balanced(String s) {
    def pairs = [')': '(', ']': '[', '}': '{']
    def stack = []
    for (c in s) {
        def ch = c as String
        if (ch in ['(', '[', '{']) stack << ch
        else if (pairs.containsKey(ch)) {
            if (stack.isEmpty() || stack.removeLast() != pairs[ch]) return false
        }
    }
    return stack.isEmpty()
}

def r1 = balanced("([{}])") ? "yes" : "no"
def r2 = balanced("([)]") ? "yes" : "no"
println "$r1 $r2"

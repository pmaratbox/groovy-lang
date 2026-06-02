def stack = []
[1, 2, 3].each { stack.add(it) }

def popped = []
while (stack) {
    popped << stack.removeLast()
}

println popped.join(" ")

class MinStack {
    List<Integer> stack = []
    List<Integer> mins = []
    void push(int v) {
        stack << v
        mins << (mins.isEmpty() ? v : Math.min(v, mins.last()))
    }
    int pop() {
        mins.removeAt(mins.size() - 1)
        stack.removeAt(stack.size() - 1)
    }
    int getMin() { mins.last() }
}

def s = new MinStack()
[3, 1, 2].each { s.push(it) }
println "min: ${s.getMin()}"

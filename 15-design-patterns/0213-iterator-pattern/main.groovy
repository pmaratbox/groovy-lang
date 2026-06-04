class RangeIterator implements Iterator<Integer> {
    int current
    int end
    RangeIterator(int start, int end) { current = start; this.end = end }
    boolean hasNext() { current <= end }
    Integer next() { current++ }
}

def values = []
def it = new RangeIterator(1, 3)
while (it.hasNext()) {
    values << it.next()
}
println(values.join(' '))

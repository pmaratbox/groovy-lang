class MinHeap {
    List<Integer> data = []
    void push(int v) {
        data << v
        int i = data.size() - 1
        while (i > 0) {
            int parent = (i - 1).intdiv(2)
            if (data[parent] <= data[i]) break
            def tmp = data[i]; data[i] = data[parent]; data[parent] = tmp
            i = parent
        }
    }
    int pop() {
        int top = data[0]
        int last = data.removeAt(data.size() - 1)
        if (!data.isEmpty()) {
            data[0] = last
            int i = 0, n = data.size()
            while (true) {
                int l = 2 * i + 1, r = 2 * i + 2, smallest = i
                if (l < n && data[l] < data[smallest]) smallest = l
                if (r < n && data[r] < data[smallest]) smallest = r
                if (smallest == i) break
                def tmp = data[i]; data[i] = data[smallest]; data[smallest] = tmp
                i = smallest
            }
        }
        top
    }
    boolean isEmpty() { data.isEmpty() }
}

def heap = new MinHeap()
[3, 1, 2].each { heap.push(it) }
def out = []
while (!heap.isEmpty()) out << heap.pop()
println out.join(' ')

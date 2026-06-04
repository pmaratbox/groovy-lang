class Fenwick {
    int[] bit

    Fenwick(List<Integer> data) {
        bit = new int[data.size() + 1]
        data.eachWithIndex { v, i -> update(i + 1, v) }
    }

    void update(int i, int delta) {
        for (; i < bit.length; i += i & (-i)) bit[i] += delta
    }

    int prefix(int i) {
        int sum = 0
        for (; i > 0; i -= i & (-i)) sum += bit[i]
        sum
    }
}

def f = new Fenwick([1, 2, 3, 4, 5])
println(f.prefix(4))

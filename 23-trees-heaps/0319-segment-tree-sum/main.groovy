class SegmentTree {
    int n
    int[] tree

    SegmentTree(List<Integer> data) {
        n = data.size()
        tree = new int[2 * n]
        for (int i = 0; i < n; i++) tree[n + i] = data[i]
        for (int i = n - 1; i > 0; i--) tree[i] = tree[2 * i] + tree[2 * i + 1]
    }

    int query(int l, int r) {
        int sum = 0
        l += n; r += n + 1
        while (l < r) {
            if ((l & 1) == 1) sum += tree[l++]
            if ((r & 1) == 1) sum += tree[--r]
            l >>= 1; r >>= 1
        }
        sum
    }
}

def st = new SegmentTree([1, 2, 3, 4, 5])
println(st.query(1, 3))

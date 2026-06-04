class SparseMatrix {
    Map<List<Integer>, Integer> entries = [:]

    void set(int row, int col, int value) {
        if (value == 0) entries.remove([row, col])
        else entries[[row, col]] = value
    }

    int get(int row, int col) {
        entries.getOrDefault([row, col], 0)
    }
}

def matrix = new SparseMatrix()
matrix.set(1, 1, 5)
println("${matrix.get(1, 1)} ${matrix.get(0, 0)}")

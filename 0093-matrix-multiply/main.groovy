def a = [[1, 2], [3, 4]]
def b = [[5, 6], [7, 8]]
int n = 2
def result = (0..<n).collect { [0] * n }
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            result[i][j] += a[i][k] * b[k][j]
        }
    }
}

result.each { row ->
    println row.join(" ")
}

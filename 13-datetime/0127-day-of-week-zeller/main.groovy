def zeller(int y, int m, int d) {
    if (m < 3) { m += 12; y -= 1 }
    int k = y % 100
    int j = (int) (y / 100)
    int h = (d + (int) (13 * (m + 1) / 5) + k + (int) (k / 4) + (int) (j / 4) + 5 * j) % 7
    // Zeller: 0=Saturday, 1=Sunday, ... 6=Friday
    def names = ['Saturday', 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday']
    names[h]
}

println(zeller(2000, 1, 1))

def rabinKarp(String text, String pat) {
    int m = pat.length(), n = text.length()
    long base = 256, mod = 1_000_000_007L
    long ph = 0, th = 0, h = 1
    for (int i = 0; i < m - 1; i++) h = (h * base) % mod
    for (int i = 0; i < m; i++) {
        ph = (ph * base + (int) pat[i]) % mod
        th = (th * base + (int) text[i]) % mod
    }
    def res = []
    for (int i = 0; i <= n - m; i++) {
        if (ph == th && text.substring(i, i + m) == pat) res << i
        if (i < n - m) {
            th = ((th - (int) text[i] * h) * base + (int) text[i + m]) % mod
            if (th < 0) th += mod
        }
    }
    res
}

println rabinKarp("xabxab", "ab").join(" ")

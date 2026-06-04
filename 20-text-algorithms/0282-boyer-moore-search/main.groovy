def boyerMoore(String text, String pat) {
    int m = pat.length(), n = text.length()
    def last = [:]
    for (int i = 0; i < m; i++) last[pat[i]] = i
    int s = 0
    while (s <= n - m) {
        int j = m - 1
        while (j >= 0 && pat[j] == text[s + j]) j--
        if (j < 0) return s
        int bc = last.getOrDefault(text[s + j], -1)
        s += Math.max(1, j - bc)
    }
    -1
}

println boyerMoore("zzabc", "abc")

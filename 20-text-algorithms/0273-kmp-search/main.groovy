def kmp(String text, String pat) {
    int m = pat.length()
    int[] lps = new int[m]
    int len = 0
    for (int i = 1; i < m;) {
        if (pat[i] == pat[len]) {
            lps[i++] = ++len
        } else if (len > 0) {
            len = lps[len - 1]
        } else {
            lps[i++] = 0
        }
    }
    def res = []
    int j = 0
    for (int i = 0; i < text.length();) {
        if (text[i] == pat[j]) {
            i++; j++
            if (j == m) { res << i - m; j = lps[j - 1] }
        } else if (j > 0) {
            j = lps[j - 1]
        } else {
            i++
        }
    }
    res
}

println kmp("ababab", "ab").join(" ")

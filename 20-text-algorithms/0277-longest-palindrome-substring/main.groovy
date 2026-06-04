def expand(String s, int l, int r) {
    while (l >= 0 && r < s.length() && s[l] == s[r]) { l--; r++ }
    [l + 1, r]
}

def longestPalindrome(String s) {
    int start = 0, len = 0
    for (int i = 0; i < s.length(); i++) {
        [expand(s, i, i), expand(s, i, i + 1)].each { lr ->
            int l = lr[0], r = lr[1]
            if (r - l > len) { len = r - l; start = l }
        }
    }
    s.substring(start, start + len)
}

println longestPalindrome("babad")

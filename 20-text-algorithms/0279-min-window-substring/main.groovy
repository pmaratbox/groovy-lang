def minWindow(String s, String t) {
    def need = [:].withDefault { 0 }
    t.each { need[it]++ }
    int required = need.size()
    def window = [:].withDefault { 0 }
    int formed = 0, l = 0, bestLen = Integer.MAX_VALUE, bestL = 0
    for (int r = 0; r < s.length(); r++) {
        def c = s[r]
        window[c]++
        if (need.containsKey(c) && window[c] == need[c]) formed++
        while (formed == required) {
            if (r - l + 1 < bestLen) { bestLen = r - l + 1; bestL = l }
            def lc = s[l]
            window[lc]--
            if (need.containsKey(lc) && window[lc] < need[lc]) formed--
            l++
        }
    }
    bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestL + bestLen)
}

println minWindow("ADOBECODEBANC", "ABC")

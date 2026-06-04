def longestCommonSubstring(String a, String b) {
    int[][] dp = new int[a.length() + 1][b.length() + 1]
    int best = 0, end = 0
    for (int i = 1; i <= a.length(); i++) {
        for (int j = 1; j <= b.length(); j++) {
            if (a[i - 1] == b[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
                if (dp[i][j] > best) { best = dp[i][j]; end = i }
            }
        }
    }
    a.substring(end - best, end)
}

println longestCommonSubstring("abcde", "xbcdy")

def matchGlob
matchGlob = { String pat, String str ->
    if (pat.isEmpty()) return str.isEmpty()
    if (pat[0] == '*') {
        return matchGlob(pat.substring(1), str) ||
               (!str.isEmpty() && matchGlob(pat, str.substring(1)))
    }
    return !str.isEmpty() && pat[0] == str[0] && matchGlob(pat.substring(1), str.substring(1))
}
def report = { p, s -> matchGlob(p, s) ? 'yes' : 'no' }
println "${report('a*b', 'aaab')} ${report('a*b', 'aac')}"

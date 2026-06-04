def pattern = 'ab'
def text = 'aab'
int state = 0
int matchIndex = -1
text.eachWithIndex { ch, i ->
    if (matchIndex >= 0) return
    if (ch == pattern[state]) {
        state++
        if (state == pattern.length()) {
            matchIndex = i - pattern.length() + 1
        }
    } else {
        state = (ch == pattern[0]) ? 1 : 0
    }
}
println matchIndex

def text = "aaabbc"
def result = new StringBuilder()
int i = 0
while (i < text.length()) {
    def ch = text[i]
    int count = 0
    while (i < text.length() && text[i] == ch) {
        count++
        i++
    }
    result.append(ch).append(count)
}
println result.toString()

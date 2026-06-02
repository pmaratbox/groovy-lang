def text = "abc"
int shift = 1
def sb = new StringBuilder()
text.each { ch ->
    int code = (ch as char) as int
    sb.append((char) ((code - 97 + shift) % 26 + 97))
}
println sb.toString()

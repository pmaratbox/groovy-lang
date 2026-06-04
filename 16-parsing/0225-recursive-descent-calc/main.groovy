class Parser {
    String s
    int pos = 0

    Parser(String s) { this.s = s }

    int parse() { expr() }

    int expr() {
        int v = term()
        while (pos < s.length() && s[pos] == '+') { pos++; v += term() }
        return v
    }

    int term() {
        int v = factor()
        while (pos < s.length() && s[pos] == '*') { pos++; v *= factor() }
        return v
    }

    int factor() {
        int start = pos
        while (pos < s.length() && s[pos].isInteger()) pos++
        return s[start..<pos] as int
    }
}

println new Parser("2+3*4").parse()

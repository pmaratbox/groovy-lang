def atoi = { String s ->
    int i = 0
    int sign = 1
    if (s[0] == '-') { sign = -1; i = 1 }
    else if (s[0] == '+') { i = 1 }
    int n = 0
    while (i < s.length()) {
        n = n * 10 + ((s[i] as char) - ('0' as char))
        i++
    }
    sign * n
}

def itoa = { int n ->
    if (n == 0) return "0"
    boolean neg = n < 0
    int m = Math.abs(n)
    def digits = []
    while (m > 0) {
        digits << (char)(('0' as char) + (m % 10))
        m = (int)(m / 10)
    }
    (neg ? "-" : "") + digits.reverse().join()
}

int parsed = atoi("-42")
String formatted = itoa(parsed)
println "$parsed $formatted"

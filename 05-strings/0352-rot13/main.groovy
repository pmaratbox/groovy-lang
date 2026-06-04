def rot13 = { String s ->
    s.collect { ch ->
        if (ch ==~ /[a-z]/) {
            ((((ch as char) - ('a' as char) + 13) % 26) + ('a' as char)) as char
        } else if (ch ==~ /[A-Z]/) {
            ((((ch as char) - ('A' as char) + 13) % 26) + ('A' as char)) as char
        } else {
            ch
        }
    }.join()
}

def encoded = rot13("hello")
def decoded = rot13(encoded)
println "$encoded $decoded"

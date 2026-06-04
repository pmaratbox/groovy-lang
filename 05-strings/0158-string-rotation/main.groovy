def a = "abcd"
def b = "cdab"
def rotation = a.length() == b.length() && (a + a).contains(b)
println rotation ? "yes" : "no"

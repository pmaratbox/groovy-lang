def text = "ababab"
def needle = "ab"
def count = 0
def i = 0
while ((i = text.indexOf(needle, i)) != -1) {
    count++
    i += needle.length()
}
println count

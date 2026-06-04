def words = ["flower", "flow", "flight"]
def prefix = words[0]
words.each { w ->
    while (!w.startsWith(prefix)) {
        prefix = prefix[0..<prefix.length() - 1]
    }
}
println prefix

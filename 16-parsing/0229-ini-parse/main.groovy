def ini = """[s]
k=v"""
def section = ""
def out = []
ini.eachLine { line ->
    line = line.trim()
    if (line.startsWith("[") && line.endsWith("]")) {
        section = line[1..-2]
    } else if (line.contains("=")) {
        def (k, v) = line.split("=", 2)
        out << "${section}.${k}=${v}"
    }
}
println out.join("\n")

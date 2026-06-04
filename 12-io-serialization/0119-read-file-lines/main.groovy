def f = new File('lines.txt')
f.text = "one\ntwo\nthree\n"
def count = f.readLines().count { it.trim() }
println "lines: ${count}"
f.delete()

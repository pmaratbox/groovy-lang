def f = new File('data.txt')
f.text = "a\n"
f.append("b\n")
println f.readLines().join(' ')
f.delete()

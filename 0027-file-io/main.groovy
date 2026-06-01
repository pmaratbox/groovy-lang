def path = "greeting.txt"
def file = new File(path)
file.text = "hello, file"
def content = file.text
file.delete()
println "read: ${content}"

def template = "hi {name}"
def vars = [name: "Ada"]
def result = template.replaceAll(/\{(\w+)\}/) { full, key -> vars[key] }
println result

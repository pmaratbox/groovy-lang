def parts = "hello_world".split('_')
def camel = parts[0] + parts[1..-1].collect { it.capitalize() }.join()
println camel

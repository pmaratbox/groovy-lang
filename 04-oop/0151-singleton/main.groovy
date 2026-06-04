@Singleton
class Registry {}

def a = Registry.instance
def b = Registry.instance
println "same: ${a.is(b) ? 'yes' : 'no'}"

def json = '{"x":1,"y":2}'
def body = json[1..-2]
def parts = body.split(',').collect { pair ->
    def (k, v) = pair.split(':').collect { it.replaceAll('"', '') }
    "${k}=${v}"
}
println parts.join(' ')

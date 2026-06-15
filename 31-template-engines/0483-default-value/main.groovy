import groovy.text.SimpleTemplateEngine

def src = '${binding.variables.get("name") ?: "anonymous"}'
def out = new SimpleTemplateEngine().createTemplate(src).make([:]).toString()
println out

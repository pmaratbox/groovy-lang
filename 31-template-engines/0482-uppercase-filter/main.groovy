import groovy.text.SimpleTemplateEngine

def src = '${name.toUpperCase()}'
def out = new SimpleTemplateEngine().createTemplate(src).make([name: 'alice']).toString()
println out

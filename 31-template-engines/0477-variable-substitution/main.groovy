import groovy.text.SimpleTemplateEngine

def src = 'Hello ${name}'
def tpl = new SimpleTemplateEngine().createTemplate(src).make([name: 'alice'])
println tpl.toString()

import groovy.text.SimpleTemplateEngine

def src = '${items.size()}'
def out = new SimpleTemplateEngine().createTemplate(src).make([items: [1, 2, 3]]).toString()
println out

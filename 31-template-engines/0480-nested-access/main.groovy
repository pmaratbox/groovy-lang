import groovy.text.SimpleTemplateEngine

def src = '${user.name}'
def data = [user: [name: 'alice']]

def template = new SimpleTemplateEngine().createTemplate(src).make(data)
println template.toString()

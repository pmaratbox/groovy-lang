import groovy.text.SimpleTemplateEngine

def src = '<% users.eachWithIndex { u, i -> %>${u.name}: ${u.age}<% if (i < users.size() - 1) { %>\n<% } } %>'
def data = [users: [[name: 'alice', age: 30], [name: 'bob', age: 25]]]
def t = new SimpleTemplateEngine().createTemplate(src).make(data)
println t.toString()

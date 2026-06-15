import groovy.text.SimpleTemplateEngine

def src = '<% if (logged_in) { %>welcome<% } else { %>guest<% } %>'
def t = new SimpleTemplateEngine().createTemplate(src).make([logged_in: true])
print t.toString()
println()

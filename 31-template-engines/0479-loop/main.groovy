import groovy.text.SimpleTemplateEngine

// <% %> scriptlets run Groovy code; ${...} interpolates. The .each loop
// emits one number per line, so the engine itself builds the multi-line output.
def src = '<% nums.each { n -> %>${n}\n<% } %>'
def out = new SimpleTemplateEngine().createTemplate(src).make([nums: [1, 2, 3]]).toString()

// The template ends each line (including the last) with a newline; drop the
// final trailing newline so the rendered loop output is 1\n2\n3.
print out.endsWith('\n') ? out[0..-2] : out
println()

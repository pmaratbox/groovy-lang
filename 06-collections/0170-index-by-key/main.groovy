def people = [[id: 1, name: 'alice'], [id: 2, name: 'bob']]
def byId = people.collectEntries { [(it.id): it.name] }
println "id 2: ${byId[2]}"

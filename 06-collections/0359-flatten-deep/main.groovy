def nested = [1, [2, [3, 4]], 5]

def flatten
flatten = { node ->
    node instanceof List ? node.collectMany { flatten(it) } : [node]
}

println flatten(nested).join(" ")

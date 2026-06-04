def counts = [:] as LinkedHashMap
"aab".each { ch -> counts[ch] = (counts[ch] ?: 0) + 1 }
println counts.collect { k, v -> "$k:$v" }.join(' ')

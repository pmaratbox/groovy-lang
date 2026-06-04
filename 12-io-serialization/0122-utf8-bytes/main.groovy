def bytes = "Hi".getBytes("UTF-8")
println bytes.collect { it & 0xFF }.join(' ')

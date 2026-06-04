def bytes = "Hi".getBytes("UTF-8")
println bytes.collect { String.format("%02x", it & 0xFF) }.join(' ')

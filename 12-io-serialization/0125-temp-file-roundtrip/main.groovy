def tmp = File.createTempFile("roundtrip", ".txt")
tmp.text = "ok-data"
def back = tmp.text
tmp.delete()
println "roundtrip: ${back == 'ok-data' ? 'ok' : 'fail'}"

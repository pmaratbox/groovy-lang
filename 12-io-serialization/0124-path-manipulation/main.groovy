import java.nio.file.Paths

def p = Paths.get("/tmp", "file.txt")
def joined = p.toString().replace('\\', '/')
def base = p.fileName.toString()
def ext = base.substring(base.lastIndexOf('.'))
println "${joined} ${base} ${ext}"

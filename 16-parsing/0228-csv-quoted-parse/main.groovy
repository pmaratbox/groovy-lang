def row = 'a,"b,c",d'
def fields = []
def cur = new StringBuilder()
boolean inQuotes = false
for (ch in row) {
    if (ch == '"') inQuotes = !inQuotes
    else if (ch == ',' && !inQuotes) {
        fields << cur.toString()
        cur = new StringBuilder()
    } else cur << ch
}
fields << cur.toString()
println fields.join("|")

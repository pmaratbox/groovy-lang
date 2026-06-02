def sb = new StringBuilder()
[1, 2, 3].eachWithIndex { n, i ->
    if (i > 0) sb.append("-")
    sb.append(n)
}
println sb.toString()

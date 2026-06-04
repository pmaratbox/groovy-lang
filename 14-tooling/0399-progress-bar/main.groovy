int width = 10
double pct = 0.4
int filled = Math.round(width * pct) as int
println "[${'#' * filled}${'-' * (width - filled)}]"

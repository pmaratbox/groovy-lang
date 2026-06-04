def houses = [2, 7, 9, 3, 1]
def rob = 0, skip = 0
houses.each { v ->
    def newRob = skip + v
    def newSkip = Math.max(rob, skip)
    rob = newRob
    skip = newSkip
}
println Math.max(rob, skip)

def floor = 0
def visited = [floor]
def moveTo = { target ->
    while (floor != target) {
        floor += (target > floor) ? 1 : -1
        visited << floor
    }
}
moveTo(2)
moveTo(0)
println visited.join(' ')

import java.util.PriorityQueue

def size = 3
def goal = [2, 2]
def h = { r, c -> Math.abs(r - goal[0]) + Math.abs(c - goal[1]) }

def gScore = [:].withDefault { Integer.MAX_VALUE }
gScore[[0, 0]] = 0
def pq = new PriorityQueue<List>({ a, b -> a[0] <=> b[0] } as Comparator)
pq << [h(0, 0), 0, 0]

def answer = -1
while (pq) {
    def (f, r, c) = pq.poll()
    if ([r, c] == goal) { answer = gScore[[r, c]]; break }
    [[1,0],[-1,0],[0,1],[0,-1]].each { dr, dc ->
        def nr = r + dr, nc = c + dc
        if (nr in 0..<size && nc in 0..<size) {
            def tentative = gScore[[r, c]] + 1
            if (tentative < gScore[[nr, nc]]) {
                gScore[[nr, nc]] = tentative
                pq << [tentative + h(nr, nc), nr, nc]
            }
        }
    }
}
println answer

def lock = new Object()
int counter = 0
def threads = (1..10).collect {
    Thread.start {
        100.times {
            synchronized (lock) {
                counter++
            }
        }
    }
}
threads*.join()
println counter

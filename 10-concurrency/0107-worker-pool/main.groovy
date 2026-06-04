import java.util.concurrent.Executors

def pool = Executors.newFixedThreadPool(2)
try {
    def futures = (1..4).collect { n ->
        pool.submit({ n * n } as java.util.concurrent.Callable)
    }
    def results = futures.collect { it.get() }.sort()
    println results.join(' ')
} finally {
    pool.shutdown()
}

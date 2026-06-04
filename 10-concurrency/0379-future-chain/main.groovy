import java.util.concurrent.CompletableFuture

def result = CompletableFuture.supplyAsync { 5 }
    .thenApply { it * 2 }
    .thenApply { it + 1 }
    .get()
println result

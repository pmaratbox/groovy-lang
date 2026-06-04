import java.util.concurrent.CompletableFuture

def a = CompletableFuture.supplyAsync { 10 }
def b = CompletableFuture.supplyAsync { 20 }
def combined = a.thenCombine(b) { x, y -> x + y }
println combined.get()

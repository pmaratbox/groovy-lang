@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable

def out = []
def a = Observable.fromArray(1, 2, 3)
def b = Observable.fromArray(10, 20, 30)
Observable.zip(a, b, { x, y -> x + y }).subscribe({ out << it })
println out.join('\n')

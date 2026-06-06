@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable

def out = []
def first = Observable.fromArray(1, 2)
def second = Observable.fromArray(3, 4)
Observable.concat(first, second).subscribe({ out << it }, { e -> }, { })
println out.join('\n')

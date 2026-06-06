@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable

def out = []
Observable.fromArray(1, 2, 3, 4)
    .scan(0, { acc, x -> acc + x })
    .skip(1)
    .subscribe({ out << it }, { e -> }, { /* onComplete */ })
println out.join('\n')

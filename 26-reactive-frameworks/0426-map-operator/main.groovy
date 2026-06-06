@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable

def out = []
Observable.fromArray(1, 2, 3, 4)
    .map { it * 2 }
    .subscribe({ out << it }, { e -> }, { })
println out.join('\n')

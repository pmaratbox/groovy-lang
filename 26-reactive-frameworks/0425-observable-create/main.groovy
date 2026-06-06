@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable

def out = []
Observable.fromArray(1, 2, 3).subscribe(
    { out << it },
    { e -> },
    { out << 'done' }
)
println out.join('\n')

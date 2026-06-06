@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable

// Unbounded source of naturals 1, 2, 3, ...
def naturals = Observable.<Integer> generate({ emitter ->
    emitter.onNext(1)
}).scan(0, { acc, x -> acc + x }).skip(1)

def out = []
naturals
    .take(3)
    .subscribe(
        { v -> out << v },
        { e -> },
        { out << 'completed' }
    )

println out.join('\n')

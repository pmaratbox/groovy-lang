@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.TestScheduler
import java.util.concurrent.TimeUnit

def s = new TestScheduler()
def out = []

// outer emits 1@10, 2@20
def outer = Observable.merge(
    Observable.timer(10, TimeUnit.MILLISECONDS, s).map { 1 },
    Observable.timer(20, TimeUnit.MILLISECONDS, s).map { 2 }
)

// map each outer value n to a timed inner: n at +5, n*10 at +30
def merged = outer.flatMap { n ->
    Observable.merge(
        Observable.timer(5, TimeUnit.MILLISECONDS, s).map { n },
        Observable.timer(30, TimeUnit.MILLISECONDS, s).map { n * 10 }
    )
}

merged.subscribe({ out << it }, { e -> }, { })

s.advanceTimeBy(300, TimeUnit.MILLISECONDS)

println out.join('\n')

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

// inner(n): emits n at +5 and n*10 at +30
def inner = { int n ->
    Observable.merge(
        Observable.timer(5, TimeUnit.MILLISECONDS, s).map { n },
        Observable.timer(30, TimeUnit.MILLISECONDS, s).map { n * 10 }
    )
}

outer.switchMap { n -> inner(n) }
     .subscribe({ out << it }, { e -> }, { })

s.advanceTimeBy(300, TimeUnit.MILLISECONDS)

println out.join('\n')

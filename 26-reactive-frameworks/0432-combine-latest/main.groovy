@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.TestScheduler
import java.util.concurrent.TimeUnit

def s = new TestScheduler()
def out = []

def a = Observable.timer(10, TimeUnit.MILLISECONDS, s).map { 1 }
        .concatWith(Observable.timer(20, TimeUnit.MILLISECONDS, s).map { 2 })
def b = Observable.timer(20, TimeUnit.MILLISECONDS, s).map { 10 }

Observable.combineLatest(a, b, { x, y -> "($x, $y)" })
        .subscribe({ out << it }, { e -> }, { })

s.advanceTimeBy(300, TimeUnit.MILLISECONDS)
println out.join('\n')

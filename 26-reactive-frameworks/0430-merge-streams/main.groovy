@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.TestScheduler
import java.util.concurrent.TimeUnit

def s = new TestScheduler()
def out = []

def a = Observable.merge(
    Observable.timer(10, TimeUnit.MILLISECONDS, s).map { 1 },
    Observable.timer(30, TimeUnit.MILLISECONDS, s).map { 3 },
    Observable.timer(50, TimeUnit.MILLISECONDS, s).map { 5 })
def b = Observable.merge(
    Observable.timer(20, TimeUnit.MILLISECONDS, s).map { 2 },
    Observable.timer(40, TimeUnit.MILLISECONDS, s).map { 4 },
    Observable.timer(60, TimeUnit.MILLISECONDS, s).map { 6 })

Observable.merge(a, b).subscribe({ out << it }, { e -> }, { })

s.advanceTimeBy(300, TimeUnit.MILLISECONDS)
println out.join('\n')

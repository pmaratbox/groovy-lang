@Grab('io.reactivex.rxjava3:rxjava:3.1.8')
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.TestScheduler
import java.util.concurrent.TimeUnit

def s = new TestScheduler()
def out = []

// source emits a@10, b@20, c@100; complete late so trailing c survives
def src = Observable.create({ emitter ->
    s.scheduleDirect({ emitter.onNext('a') }, 10, TimeUnit.MILLISECONDS)
    s.scheduleDirect({ emitter.onNext('b') }, 20, TimeUnit.MILLISECONDS)
    s.scheduleDirect({ emitter.onNext('c') }, 100, TimeUnit.MILLISECONDS)
    s.scheduleDirect({ emitter.onComplete() }, 140, TimeUnit.MILLISECONDS)
})

src.debounce(30, TimeUnit.MILLISECONDS, s)
   .subscribe({ out << it }, { e -> }, { })

s.advanceTimeBy(300, TimeUnit.MILLISECONDS)

println out.join('\n')

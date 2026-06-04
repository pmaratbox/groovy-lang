interface Subject { String request() }

class RealSubject implements Subject {
    String request() { 'loaded' }
}

class VirtualProxy implements Subject {
    private RealSubject real

    String request() {
        if (real == null) {
            real = new RealSubject()
        }
        real.request()
    }
}

Subject proxy = new VirtualProxy()
println(proxy.request())

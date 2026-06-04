trait A {
    String a() { 'a' }
}

trait B {
    String b() { 'b' }
}

class AB implements A, B {
}

def ab = new AB()
println "${ab.a()} ${ab.b()}"

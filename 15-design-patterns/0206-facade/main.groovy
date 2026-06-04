class Sub1 { void init() {} }
class Sub2 { void init() {} }
class Sub3 { void init() {} }

class Facade {
    def sub1 = new Sub1()
    def sub2 = new Sub2()
    def sub3 = new Sub3()

    String start() {
        sub1.init()
        sub2.init()
        sub3.init()
        'ready'
    }
}

println(new Facade().start())

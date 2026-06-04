interface Logger { void log(String message) }

class NullLogger implements Logger {
    void log(String message) {}
}

class RealLogger implements Logger {
    int count = 0
    void log(String message) { count++ }
}

def nullLogger = new NullLogger()
def realLogger = new RealLogger()

nullLogger.log('ignored')
realLogger.log('recorded')

println(realLogger.count)

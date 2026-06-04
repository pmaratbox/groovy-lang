class BaseError extends RuntimeException {
    BaseError(String msg) { super(msg) }
}

class SpecificError extends BaseError {
    SpecificError(String msg) { super(msg) }
}

try {
    throw new SpecificError("boom")
} catch (BaseError e) {
    println "caught base"
}

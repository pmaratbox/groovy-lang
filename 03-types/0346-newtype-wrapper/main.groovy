import groovy.transform.Immutable

@Immutable
class UserId {
    int value
    String toString() { "user-${value}" }
}

@Immutable
class ProductId {
    int value
    String toString() { "prod-${value}" }
}

println "${new UserId(1)} ${new ProductId(2)}"

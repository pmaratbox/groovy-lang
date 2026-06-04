def power(int base, int exp) {
    exp == 0 ? 1 : base * power(base, exp - 1)
}

println power(2, 10)

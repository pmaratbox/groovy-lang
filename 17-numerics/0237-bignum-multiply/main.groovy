def multiplyStrings(String a, String b) {
    int n = a.length(), m = b.length()
    int[] prod = new int[n + m]
    for (int i = n - 1; i >= 0; i--) {
        for (int j = m - 1; j >= 0; j--) {
            int mul = Character.getNumericValue(a.charAt(i)) *
                      Character.getNumericValue(b.charAt(j))
            int p1 = i + j, p2 = i + j + 1
            int sum = mul + prod[p2]
            prod[p2] = sum % 10
            prod[p1] += (sum / 10) as int
        }
    }
    def sb = new StringBuilder()
    prod.each { if (!(sb.length() == 0 && it == 0)) sb.append(it) }
    sb.length() == 0 ? '0' : sb.toString()
}

println multiplyStrings('123', '456')

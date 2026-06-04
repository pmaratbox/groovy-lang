def addStrings(String a, String b) {
    def result = new StringBuilder()
    int i = a.length() - 1, j = b.length() - 1, carry = 0
    while (i >= 0 || j >= 0 || carry > 0) {
        int da = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0
        int db = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0
        int sum = da + db + carry
        result.insert(0, (sum % 10))
        carry = (sum / 10) as int
        i--; j--
    }
    result.toString()
}

println addStrings('999999999999', '1')

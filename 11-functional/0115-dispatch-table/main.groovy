def ops = [add: { a, b -> a + b }, mul: { a, b -> a * b }]

println "${ops.add(3, 4)} ${ops.mul(3, 4)}"

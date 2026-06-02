def letters = ["a", "b", "c"]
def nums = [1, 2, 3]
def pairs = [letters, nums].transpose().collect { k, n -> "$k=$n" }
println pairs.join(" ")

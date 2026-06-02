def nums = [1, 2, 3, 4, 5, 6]
def (evens, odds) = nums.split { it % 2 == 0 }
println "evens: " + evens.join(" ")
println "odds: " + odds.join(" ")

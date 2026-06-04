def nums = [1, 2]
def letters = ['a', 'b']
def pairs = nums.collectMany { n -> letters.collect { l -> "$n$l" } }
println pairs.join(' ')

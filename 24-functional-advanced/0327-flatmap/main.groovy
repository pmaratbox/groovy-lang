def result = [1, 2, 3].collectMany { x -> [x, x * 10] }

println result.join(' ')

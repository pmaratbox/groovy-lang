def nums = [1, 3, 5, 7, 9]
def target = 7

int lo = 0
int hi = nums.size() - 1
int index = -1
while (lo <= hi) {
    int mid = (lo + hi).intdiv(2)
    if (nums[mid] == target) {
        index = mid
        break
    } else if (nums[mid] < target) {
        lo = mid + 1
    } else {
        hi = mid - 1
    }
}

println "found ${target} at index ${index}"

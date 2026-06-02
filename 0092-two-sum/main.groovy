def nums = [2, 7, 11, 15]
int target = 9
def seen = [:]
for (int i = 0; i < nums.size(); i++) {
    int need = target - nums[i]
    if (seen.containsKey(need)) {
        println "${seen[need]} ${i}"
        break
    }
    seen[nums[i]] = i
}

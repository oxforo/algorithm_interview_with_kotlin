package array

import java.lang.Exception

class TwoSum {
    companion object {
        fun run1(nums: Array<Int>, target: Int): Array<Int> {

            for(i in nums.indices) {
                for(j in i+1 until nums.size) {
                    if(nums[i]+ nums[j] == target)
                        return arrayOf(i,j)
                }
            }
            return throw Exception("Error")
        }

        fun run2(nums: Array<Int>, target: Int): Array<Int> {
            val hashMap = HashMap<Int, Int>()

            for( (i, num) in nums.withIndex()) {
                if(hashMap.containsKey(target - num)) {
                    return arrayOf(hashMap[target-num] ?: 0 , i)
                }
                hashMap[num] = i
            }
            return throw Exception("Error")
        }
    }
}
package array

import java.lang.Integer.max

//
class TrappingRainWater {
    companion object {
        fun run1(array: Array<Int>): Int {

            var leftSplitIndex = maxIndex(array)
            var rightSplitIndex = maxIndex(array)

            var left = array.copyOfRange(0, leftSplitIndex)
            var right = array.copyOfRange(rightSplitIndex + 1, array.size)

            var result = 0

            while(left.isNotEmpty()) {
                // 1.왼쪽 max와 인덱스 찾기
                val leftMax = left.max()
                val leftMaxIndex = maxIndex(left)

                // 2. 물 채우기
                for(i in leftMaxIndex until leftSplitIndex) {
                    result = result + leftMax - left[i]
                }

                leftSplitIndex = leftMaxIndex
                left = left.copyOfRange(0, leftSplitIndex)
            }

            while(right.isNotEmpty()) {
                // 1.오른쪽 max와 인덱스 찾기
                val rightMax = right.max()
                val rightMaxIndex = maxIndex(right)

                // 2. 물 채우기
                for(i in rightSplitIndex until rightMaxIndex) {
                    result = result + rightMax - right[i]
                }

                rightSplitIndex = rightMaxIndex
                right = right.copyOfRange(rightSplitIndex + 1, right.size)
            }
            return result
        }

        private fun maxIndex(intArray: Array<Int>): Int {
            val max = intArray.max()

            for(i in intArray.indices) {
                if(intArray[i] ==  max) {
                    return i
                }
            }
            return 0
        }

        fun run2(array: Array<Int>): Int {
            var result = 0
            var left = 0
            var right = array.size - 1
            var leftMax = array[left]
            var rightMax = array[right]

            while(left < right) {
                if(leftMax < rightMax) {
                    result += leftMax - array[left]
                    left++
                    leftMax = max(leftMax, array[left])
                }
                else {
                    result += + rightMax - array[right]
                    right--
                    rightMax = max(rightMax, array[right])
                }
            }
            return result
        }
    }
}
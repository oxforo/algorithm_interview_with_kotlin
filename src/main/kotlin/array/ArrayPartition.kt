package array

class ArrayPartition {
    companion object {
        fun run(intArray: IntArray): Int {
            intArray.sort()

            var result = 0

            for (even in intArray.indices) {
                if(even % 2 == 0) {
                    result += intArray[even]
                }
            }
            return result
        }
    }
}
package array

class ProductOfArrayExceptSelf {
    companion object {
        fun run(intArray: Array<Int>): Array<Int> {
            var p = 1
            var result = Array<Int>(intArray.size) {1}

            for(idx in intArray.indices) {
                result[idx] = p
                p *= intArray[idx]
            }

            p = 1
            for (reverseIdx in intArray.indices.reversed()) {
                result[reverseIdx] *= p
                p *= intArray[reverseIdx]
            }

            return result
        }
    }
}
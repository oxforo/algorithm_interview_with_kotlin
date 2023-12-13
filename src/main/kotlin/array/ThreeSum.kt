package array

class ThreeSum {
    companion object {
        fun run(intArray: Array<Int>): Array<Array<Int>> {
            intArray.sort()

            var result: Array<Array<Int>> = arrayOf()
            for(i in intArray.indices) {
                var leftIndex = 0
                var rightIndex = intArray.size - 1

                while (intArray[rightIndex] + intArray[leftIndex] + intArray[i] != 0
                        && leftIndex < i && i < rightIndex) {
                    if (intArray[rightIndex] + intArray[leftIndex] + intArray[i] > 0) {
                        rightIndex--
                    } else if (intArray[rightIndex] + intArray[leftIndex] + intArray[i] < 0) {
                        leftIndex++
                    }
                }

                if (intArray[rightIndex] + intArray[leftIndex] + intArray[i] == 0) {
                    result += arrayOf(intArray[leftIndex], intArray[i], intArray[rightIndex])
                }
          }
        return result
        }
    }
}
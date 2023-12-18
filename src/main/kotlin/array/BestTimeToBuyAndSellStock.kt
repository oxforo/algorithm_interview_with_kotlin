package array

import java.lang.Math.max
import java.lang.Math.min


class BestTimeToBuyAndSellStock {
    companion object {
        fun run(intArray: IntArray): Int {

            var minPrice = intArray[0]
            var maxValue = 0
            for(idx in intArray.indices) {
                minPrice = min(minPrice, intArray[idx])
                maxValue = max(maxValue, intArray[idx]- minPrice)
            }
            return maxValue
        }
    }
}
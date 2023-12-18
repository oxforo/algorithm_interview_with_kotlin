import array.BestTimeToBuyAndSellStock
import array.ProductOfArrayExceptSelf

fun main() {
//    val isPalindrome = string.ValidPalindrome.validate("Do gees see God?")
//    println(isPalindrome)

//    val charArray = charArrayOf('a','b','c','d', 'e')
//    string.ReverseString.reserve(charArray)
//    println(charArray)

//    val sortedFiles = string.RecorderLogFiles.sort(listOf("id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 ar zero"))
//    println(sortedFiles)

//    val mostWord = string.MostCommonWord.result(
//            paragraph = "Ross hit a ball, the hit BALL flew far away after it was hit.",
//            banned = listOf("hit")
//    )
//    println(mostWord)

//    val anagrams = string.GroupAnagrams.run(listOf("eat", "tea", "tan", "ate", "ant", "cat"))
//    println(anagrams)

//    val longestPalindromeSubstring = string.LongestPalindromeSubstring.run("dcbabcdd")
//    println(longestPalindromeSubstring)

//    val result = array.TwoSum.run2(arrayOf(2,6,11,15), 8)
//    println(result.toList())

//    val result = array.TrappingRainWater.run2(arrayOf(1,1,0,2,1,0,1,3,2,1,2,1))
//    println(result)

//    val result = ThreeSum.run(arrayOf(1,3,0, -1,5))
//    println(result.forEach { it -> println(it.toList()) })


//    val result = ProductOfArrayExceptSelf.run(arrayOf(1,3,5,-1, 12))
//    println(result.toList())

    val result = BestTimeToBuyAndSellStock.run(intArrayOf(8,1,5,3,6,4))
    println(result)
}
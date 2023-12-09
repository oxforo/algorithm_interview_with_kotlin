import kotlin.math.log

class LongestPalindromeSubstring {
    companion object {
        fun run(str: String): String {

            var longestSubString = ""
            // 1. 기준 위치 선택
            for(i in str.indices) {

                // 2. 기준 위치로 부터 하나씩 멀어짐
                for(j in 0.. str.length) {
                    // a. 기준 위치를 중심에 두고 대칭 (홀수)
                    if (i-j >= 0 && i + j < str.length && str[i - j] == str[i + j]) {
                        if ((2 * j) > longestSubString.length) {
                            longestSubString = str.substring(i - j, i + j + 1)
                        }
                    }
                    else
                        break
                }
                for(j in 0 until str.length - 1) {
                    // b. 기준 위치를 왼쪽에 두고 대칭 (짝수)
                    if (i-j >= 0 && i+1+j < str.length && str[i - j] == str[i + 1 + j]) {
                        if (( 2 + 2 * j) > longestSubString.length) {
                            longestSubString = str.substring(i - j, i + j + 1)
                        }
                    }
                    else
                        break
                }
            }
            return longestSubString
        }
    }
}
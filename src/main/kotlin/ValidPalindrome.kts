
class ValidPalindrome () {
    companion object {
        fun validate (originString: String): Boolean {

            // 문자열 필터링
            var str = originString.lowercase()
            var newStr = ""

            for(i in str.indices) {
                if(str[i].isLetterOrDigit()) {
                    newStr += str[i]
                }
            }

            // 앞뒤로 한칸씩 오면서 일치하는지 확인
            for(i in newStr.indices) {
                if (i >= newStr.length/2 )
                    break
                if (newStr[i] != newStr[newStr.length -1 - i])
                    return false
                else
                    continue
            }
            return true
        }
    }
}

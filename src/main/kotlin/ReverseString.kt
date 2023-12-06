class ReverseString {
    companion object {
        fun reserve(charArray: CharArray) {
            val size = charArray.size
            for(i in 0 until size/2) {
//                val tmp = charArray[i]
//                charArray[i] = charArray[size - 1 - i]
//                charArray[size - 1 - i] = tmp
                charArray[i] = charArray[size - 1 - i].also {
                    charArray[size - 1 - i] = charArray[i]
                }
            }
        }
    }
}
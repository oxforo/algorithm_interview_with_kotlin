package string

// replace 할때 정규식 사용하는 부분 + trim 처리
// map 초기화하면서 가져오는 부분 getOrDefault
// map의 최대값 찾는 부분 maxBy
class MostCommonWord {
    companion object {
        fun result(paragraph: String, banned: List<String>): String {
            // 1. paragraph 나누기
            val listParagraph = paragraph.replace("\\W+".toRegex(), " ").lowercase().trim().split(" ")

            // 2. banned 리스트를 제외한 단어 카운트
            val mapParagraph = mutableMapOf<String, Int>()

            for(word in  listParagraph) {
                if(!banned.contains(word)) {
                    mapParagraph[word] = mapParagraph.getOrDefault(word, 0) + 1
                }
            }

            // 3. 최빈값 확인
            return mapParagraph.maxBy { it.value}!!.key

        }
    }
}
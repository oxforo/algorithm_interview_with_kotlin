// map 컬렉션의 groupBy 시 key - groupBy 맨 마지막 값 / value - list 원소
class GroupAnagrams {
    companion object {
        fun run(lst: List<String>): Collection<List<String>> {

            val splitMap = lst.groupBy {
                val map = mutableMapOf<Char, Int>()
                for (c in it.toList()) {
                    map[c] = map.getOrDefault(c,0) + 1
                }
                map
            }
            return splitMap.values
        }
    }
}
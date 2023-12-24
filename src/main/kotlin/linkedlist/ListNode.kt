package linkedlist

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun trans(list: List<Int>): ListNode {
            val result = ListNode(list[0])

            var currentNode: ListNode = result
            for(i in 1 until list.size) {
                currentNode.next = ListNode(list[i])
                currentNode = currentNode.next ?: break
            }
            return result
        }
    }
}
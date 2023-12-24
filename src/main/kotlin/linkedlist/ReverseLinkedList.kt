package linkedlist


class ReverseLinkedList {
    companion object {
        fun run(head: ListNode?): ListNode? {

            var current: ListNode? = head
            var preHead: ListNode? = null

            // 1. 현재 노드의 next를 저장 = next
            // 2. 현재 노드의 next를 이전 head 값(preHead)으로 변경 = current.next
            // 3. 현재 노드의 이전 값을 저장 = preHead (처음에는 null / 다음은 head 변경전 저장)

            while(current != null) {
                val next = current.next
                current.next = preHead
                preHead = current
                current = next
            }

            return preHead
        }
    }
}
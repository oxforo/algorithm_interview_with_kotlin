package linkedlist

import java.util.*

class MergeTwoSortedLists {
    companion object {
        fun run(listNode1: ListNode?, listNode2: ListNode?): ListNode? {

            // 널인 경우
            // 0. 널인 경우
            // 1. 널이 아닌 경우
                // 1. 작은 값 찾기
                // 2. 재귀함수로 다음 작은 값을 찾는 함수 호출
                // 3. next로 지정
            when {
                listNode1 == null || listNode2 == null -> return listNode1 ?: listNode2 ?: null
                listNode1.`val` <= listNode2.`val` -> {
                    listNode1.next = run(listNode1.next, listNode2)
                    return listNode1
                }
                listNode1.`val` > listNode2.`val` -> {
                    listNode2.next = run(listNode1, listNode2.next)
                    return listNode2
                }
            }
            return throw Exception("error")
        }
    }
}
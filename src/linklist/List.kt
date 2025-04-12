package linklist


class ListNode(val value: Int?) {
    var next: ListNode? = null
}

 fun ListNode.append() {
    var current = this  // 哨兵节点作为起始点
    while (true) {
        val input = readln().toInt()
        if (input == -1) break

        // 尾插法优化：始终找到链表末尾插入
        while (current.next != null) {
            current = current.next!!
        }
        current.next = ListNode(input)
    }
}

 fun ListNode.print() {
    var p = this.next  // 跳过哨兵节点
    while (p != null) {
        println(p.value)
        p = p.next
    }
}
 fun ListNode.delete(value: Int) {
    var prev = this    // 从哨兵节点开始遍历
    while (prev.next != null) {
        if (prev.next!!.value == value) {
            prev.next = prev.next!!.next
            return
        }
        prev = prev.next!!
    }
}

fun main() {
    // 创建哨兵节点（value=null作为标识）
    val sentinel = ListNode(null)
    sentinel.append()
    sentinel.print()
    sentinel.delete(1)
    sentinel.print()
}
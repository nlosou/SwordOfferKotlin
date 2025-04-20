package linklist

data class Node<T>(var data: T, var next: Node<T>? = null)

class LinkedList<T> {
    private var head: Node<T>? = null

    // 头部插入（O(1)）
    fun addToHead(data: T) {
        head = Node(data, head)
    }

    // 尾部插入（O(n)）
    fun addToTail(data: T) {
        if (head == null) {
            head = Node(data)
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = Node(data)
    }

    // 遍历打印
    fun print() {
        var current = head
        while (current != null) {
            print("${current.data} → ")
            current = current.next
        }
        println("null")
    }
}
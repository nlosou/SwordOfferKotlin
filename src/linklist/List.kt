package linklist


class ListNode(val value: Int?) {
    var next: ListNode? = null

    fun append(intput:Int) {
        var current = this  // 哨兵节点作为起始点
        // 尾插法优化：始终找到链表末尾插入
        while (current.next != null) {
            current = current.next!!
        }
        current.next = ListNode(intput)
    }
    fun print() {
        var p = this.next  // 跳过哨兵节点
        while (p != null) {
            print(p.value)
            p = p.next
        }
    }
    fun delete(value: Int) {
        var prev = this    // 从哨兵节点开始遍历
        while (prev.next != null) {
            if (prev.next!!.value == value) {
                prev.next = prev.next!!.next
                return
            }
            prev = prev.next!!
        }
    }
    fun genCricle(enter:Int){
        var prev=this
        var prec2=this
        while (prev.next!=null){
            prev= prev.next!!
        }
        for( i in 1..enter){
            prec2= prec2.next!!
        }
        prev.next=prec2
    }
}




fun main() {

}
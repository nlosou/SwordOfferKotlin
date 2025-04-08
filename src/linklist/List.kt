package linklist



//用哨兵节点优化一下
// 建议方案：避免关键字冲突，改用更清晰的字段名
class ListNode(val value: Int?) {
    var next: ListNode? = null
}

private fun ListNode.append() {
    var a: Int = 0
    while (a != -1) {
        a = readln().toInt()
        val newNode = ListNode(a)
        newNode.next = this.next
        this.next = newNode
    }
}

private fun ListNode.print(){
    var p=this.next
    while (p!=null){
        println("${p.value}")
        p=p.next
    }
}

private fun ListNode.delete(value: Int){
    var p=this.next
    while (p!!.next!!.value!=value){
        p=p.next
    }
    p.next= p.next?.next
}

fun main(){
    //创作链表并创建头节点
    val headNode=ListNode(value = null)
    headNode.next=null
    headNode.append()
    headNode.print()
    headNode.delete(1)
    headNode.print()
}
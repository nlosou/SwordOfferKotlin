package linklist

/**
 * 题目:如果给定一个链表,请问如何删除链表中的倒数第 k 个节点?
 * 假设链表中节点的总数为 n,那么 1≤k≤n。要求只能遍历链表一次。
 * 例如,输入图 4.1(a)中的链表,删除倒数第 2 个节点之后的链表如
 * 图 4.1(b)所示。
 */


fun delete_k_node(Head:ListNode,k:Int){
    //遍历了三遍
    val head=Head.next
    var p=head
    var j=head
    var count=0
    while (count!=k){
        if (p != null) {
            p=p.next
        }
        count++
    }
    while (p!!.next!=null){
        p=p.next
        if (j != null) {
            j=j.next
        }
    }
    j!!.next= j.next!!.next
}
fun main(){
    // 创建哨兵节点（value=null作为标识）
    val sentinel = ListNode(null)
    sentinel.append()
    delete_k_node(sentinel,2)
    sentinel.print()
}
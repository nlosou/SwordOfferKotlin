package linklist

/**
 * 题目:如果一个链表中包含环,那么应该如何找出环的入口节点?从
 * 链表的头节点开始顺着 next 指针方向进入环的第 1 个节点为环的入口节点。
 * 例如,在如图 4.3 所示的链表中,环的入口节点是节点 3。
 */




//找到相遇的节点
fun findEnter2(head:ListNode): ListNode? {
    if(head.next==null){
        return null
    }
    var show=head.next
    var fast= show?.next
    while (show!=null&&fast!=null){
        if(show==fast) return show
        show=show.next
        fast=fast.next
        if(fast!=null){
            fast=fast.next
        }
    }
    return null
}

fun finder3(i: ListNode,j:ListNode){
    var i=i
    var j=j
   while (i!=j){
       i= i.next!!
       j= j.next!!
   }
    println(i.value)
}

fun main(){
//    val sentinel = ListNode(null)
//    sentinel.append()
//    sentinel.genCricle(3)
//    println(findEnter2(sentinel)?.value)
//    findEnter2(sentinel)?.let { finder3(sentinel, it) }
//    //sentinel.print()
}
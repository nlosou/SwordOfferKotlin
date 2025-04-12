package linklist

/**
 * 题目:如果一个链表中包含环,那么应该如何找出环的入口节点?从
 * 链表的头节点开始顺着 next 指针方向进入环的第 1 个节点为环的入口节点。
 * 例如,在如图 4.3 所示的链表中,环的入口节点是节点 3。
 */

fun findEnter(head:ListNode): Int? {
    var i=head
    for (k in 1..6){ //这是知道链表长度的情况
        i= i.next!!
    }
    var j=head
    while (i.next?.value !=j.value){
        j=j.next!!
    }
   return j.value
}

fun main(){
    val sentinel = ListNode(null)
    sentinel.append()
    sentinel.genCricle(5)
    println(findEnter(sentinel))

    //sentinel.print()
}
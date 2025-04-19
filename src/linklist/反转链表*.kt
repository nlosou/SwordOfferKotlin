package linklist



fun reseverList(head:ListNode): ListNode {
    var prv: ListNode? =null
    var i=head.next
    while (i!=null){
        var next=i.next
        i.next=prv
        prv=i
        i=next

    }
    head.next=prv
   return head

}

fun main(){
    val list= intArrayOf(1,2,3,4,5)
    val sentinel = ListNode(null)
    list.forEach {
        sentinel.append(it)
    }
    reseverList(sentinel).print()
}
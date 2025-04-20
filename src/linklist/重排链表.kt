package linklist

fun overLoad(list1:ListNode,list2: ListNode){

    var i=list1.next
    var j=list2.next
    while (i!=null&&j!=null){
        val k= i.next
        i.next=j
        j=j.next
        i.next?.next =k
        i=k
    }
    if (i != null) {
        i.next =null
    }
}

fun overLoad2(list: ListNode){
    var i=list.next
    var j=list.next
    while (i!=null){
        i= i.next?.next
        j=j?.next
    }
    //println(j?.value)
    var list2=ListNode(null)
    list2.next=j
    var k=list
    while (k.next?.value !=j?.value){
        k= k.next!!
    }
    k.next=null
    list.print()
    println()
    list2.print()
    overLoad(list, reseverList(list2))
    println()
    list.print()
}
fun main(){
    var array= intArrayOf(1,2,3,4,5,6)
    var list1=ListNode(null)
    array.forEach {
        list1.append(it)
    }
    //list1.print()
    overLoad2(list1)
}
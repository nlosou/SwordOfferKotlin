package linklist




fun isHuiWen(list1:ListNode,list2:ListNode): Boolean {
    var i=list1.next
    var j=list2.next
    while (i!=null){
        if (i.value!=j?.value) return false
        i=i.next
        j=j?.next
    }
    return true
}
fun findCenter(list: ListNode){
    var i=list.next
    var j=list.next
    val size=list.length()
    while (i!=null){
        i= i.next?.next
        j=j?.next
    }
    //println(j?.value)
    var list2=ListNode(null)
    list2.next=j
    var k=list
    if (size%2==0){
        while (k.next !=j){
            k= k.next!!
        }
        k.next=null
    }else{
        while (k.next?.next!=j){
            k= k.next!!
        }
        k.next=null

    }
    list.print()
    println()
    list2.print()
    println()
    if (isHuiWen(list, reseverList(list2))) println("Yes")
    else println("No")
}
fun main(){
    var array= intArrayOf(1,2,4,3,2,1)
    var list=ListNode(null)
    array.forEach {
        list.append(it)
    }
    findCenter(list)
}
package linklist



fun add(list1:ListNode,list2:ListNode): ListNode {
    var list1Size=list1.length()
    var list2Size=list2.length()
    var i=list1.next
    var j=list2.next
    while (i!=null&&j!=null){
        if (list1Size>list2Size) i.value= i.value?.plus(j.value!!)
        else{

            var shang=0
            j.value= i.value?.let { j!!.value?.plus(it) }
            if (j.value!! >=10){
                var jingwei= j.value!! /10
                j.value= j.value!! % 10
                if(j.next!=null){
                    j.next?.value = j.next?.value?.plus(jingwei)
                }

            }
        }
        i=i.next
        j=j.next
    }

    return if(list1Size>list2Size) list1  else list2

}

fun main(){
    val list1= intArrayOf(1,2,3)
    val list2= intArrayOf(9,3,1)
    val sentinel1 = ListNode(null)
    val sentinel2 = ListNode(null)
    list1.forEach {
        sentinel1.append(it)
    }
    list2.forEach {
        sentinel2.append(it)
    }
    reseverList( add(reseverList(sentinel1), reseverList(sentinel2))).print()

}
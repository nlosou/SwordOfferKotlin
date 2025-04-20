package linklist



fun add(list1:ListNode,list2:ListNode): ListNode {
    var list1Size=list1.length()
    var list2Size=list2.length()
    var i=list1.next
    var j=list2.next
    while (i!=null&&j!=null){
        if (list1Size>list2Size){
            i.value= i.value?.plus(j.value!!)
            if (i.value!! >=10){
                var jingwei= i.value!! /10
                i.value= i.value!! % 10
                if(i.next!=null){
                    i.next?.value = i.next?.value?.plus(jingwei)
                }else{
                    var add_location=ListNode(jingwei)
                    add_location.next=i.next
                    i.next= add_location
                }
            }
        }
        else{
            var shang=0
            j.value= i.value?.let { j!!.value?.plus(it) }
            if (j.value!! >=10){
                var jingwei= j.value!! /10
                shang=jingwei
                j.value= j.value!! % 10
                if(j.next!=null){
                    j.next?.value = j.next?.value?.plus(jingwei)
                }else{
                    var add_location=ListNode(shang)
                    add_location.next=j.next
                    j.next= add_location
                }

            }
        }
        i=i.next
        j=j.next
    }

    return if(list1Size>list2Size) list1  else list2

}

fun main(){
    val list1= intArrayOf(9,9,9)
    val list2= intArrayOf(1)
    val sentinel1 = ListNode(null)
    val sentinel2 = ListNode(null)
    list1.forEach {
        sentinel1.append(it)
    }
    list2.forEach {
        sentinel2.append(it)
    }
    //println(Int.MAX_VALUE)
    reseverList( add(reseverList(sentinel1), reseverList(sentinel2))).print()

}
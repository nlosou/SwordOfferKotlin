package linklist

import kotlin.math.cos

/**
 * 题目:输入两个单向链表,请问如何找出它们的第 1 个重合节点。例
 * 如,图 4.5 中的两个链表的第 1 个重合节点的值是 4。
 */
fun two_list(list1:ListNode,list2: ListNode): Int? {
    var cout=0
    var count=0
    var i=list1
    var j=list2
    var first=list1
    var second=list2
    while (i.next!=null){
        cout++
        i= i.next!!
    }
    while (j.next!=null){
        count++
        j= j.next!!
    }
    if(cout>count){
        for( i in 1..cout-count){
            first= first.next!!
        }
    }
    else if(cout<count){
        for(i in 1..count-cout){
            second= second.next!!
        }
    }
    while (first!=null){
        if(first.value==second.value) return first.value
        first=first.next!!
        second=second.next!!
    }
    return  0
}

fun main(){
    var array= intArrayOf(1,2,3,4,5,6)
    val sentinel = ListNode(null)
    array.forEach {
        sentinel.append(it)
    }
    var array2= intArrayOf(7,8,9,10,6)
    val sentinel2 = ListNode(null)
    array2.forEach {
        sentinel2.append(it)
    }

    println( two_list(sentinel,sentinel2))
}
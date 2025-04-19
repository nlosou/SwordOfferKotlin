package linklist


fun main(){
    val list= intArrayOf(1,2,3,4,5)
    val sentinel = ListNode(null)
    list.forEach {
        sentinel.append(it)
    }
    reseverList(sentinel).print()
}
package String

/**
 * 题目:给定一个字符串,请问该字符串中有多少个回文连续子字符串?
 * 例如,字符串"abc"有 3 个回文子字符串,分别为"a"、"b"和"c";而字符串
 * "aaa"有 6 个回文子字符串,分别为"a"、"a"、"a"、"aa"、"aa"和"aaa"。
 */


// 建议方案：避免关键字冲突，改用更清晰的字段名
class ListNode(val value: Int?) {
        var next: ListNode? = null
}
fun main(){

        val headNode=ListNode(value = null)
        headNode.next=null
        var a:Int=0
        while (a!=-1){
                a= readln().toInt()
                val newNode=ListNode(a)
                newNode.next=headNode.next
                headNode.next=newNode
        }
}
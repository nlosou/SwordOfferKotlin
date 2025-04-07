package array.String

/*
题目:输入两个字符串 s 和 t,请找出字符串 s 中包含字符串 t 的所有
字符的最短子字符串。例如,输入的字符串 s 为"ADDBANCAD",字符串 t 为
"ABC",则字符串 s 中包含字符'A'、'B'和'C'的最短子字符串是"BANC"。如
果不存在符合条件的子字符串,则返回空字符串""。如果存在多个符合条件
的子字符串,则返回任意一个。
 */

fun sjjsss(s:String,t:String){
    val ans= mutableListOf<String>()
    val array = mutableMapOf<Int, Int>().withDefault { 0 }
    t.forEachIndexed { index, c ->
        array[c.code] = array[c.code]!! + 1
    }
    var i=0
    var j=0

}
fun main(){
    var s="ADDBANCAD"
    var t="ABC"

}
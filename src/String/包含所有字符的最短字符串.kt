package String

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
    t.forEach {
        array[it.code] = array.getValue(it.code) + 1
    }
    var i=0
    var j=0
    while (j<s.length){
        if(array.keys.contains(s[j].code)){
            array[s[j].code] = array[s[j].code]!! - 1
        }
        while (array.values.all { it<=0 }){
            ans.add(s.substring(i,j+1))
            if(array.keys.contains(s[i].code)){
                array[s[i].code] = array[s[i].code]!! +1
            }
            i++
        }
        if (!array.values.all { it<=0 }){
            j++
        }
    }
    println(ans)
    println(ans.minByOrNull { it.length })
}
fun minWindow(s: String, t: String): String {
    val charCount = mutableMapOf<Char, Int>().withDefault { 0 }
    t.forEach { charCount[it] = charCount.getValue(it) + 1 }
    var remaining = t.length
    var minLen = Int.MAX_VALUE
    var minStart = 0
    var i = 0

    for (j in s.indices) {
        val ch = s[j]
        if (charCount.getValue(ch) > 0) remaining--
        charCount[ch] = charCount.getValue(ch) - 1

        while (remaining == 0) {
            if (j - i + 1 < minLen) {
                minLen = j - i + 1
                minStart = i
            }
            val leftCh = s[i]
            charCount[leftCh] = charCount.getValue(leftCh) + 1
            if (charCount.getValue(leftCh) > 0) remaining++
            i++
        }
    }
    return if (minLen == Int.MAX_VALUE) "" else s.substring(minStart, minStart + minLen)
}
fun main(){
    var s="ADDBABCNCADABC"
    var t="ABCF"
    sjjsss(s, t)
}
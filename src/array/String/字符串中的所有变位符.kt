package array.String

import kotlin.math.sin

/*
题目:输入字符串 s1 和 s2,如何找出字符串 s2 的所有变位词在字符
串 s1 中的起始下标?假设两个字符串中只包含英文小写字母。例如,字符
串 s1 为"cbadabacg",字符串 s2 为"abc",字符串 s2 的两个变位词"cba"和"bac"
是字符串 s1 中的子字符串,输出它们在字符串 s1 中的起始下标 0 和 5。
 */



fun sjjs(a:String,b:String){
    var array= mutableMapOf<Int,Int>()

    for ( i in 'a'.code..'z'.code)
    {
        array[i]=0
    }
    b.forEach {
        array[it.code] = array[it.code]!! + 1
    }
    var i=0
    var j=b.length-1
    for (index in i..j){
        array[a[index].code] = array[a[index].code]!! - 1
    }
    while (j<a.length-1){
        var count=0
        array.forEach {
            if(it.value==0){
                count++
            }
        }
        if (count==26) println(i)
        j++
        array[a[j].code] = array[a[j].code]!! - 1
        array[a[i].code] = array[a[i].code]!! +1
        i++
    }
}
fun main(){
    var a="cbadabacg"
    var b="abc"
    sjjs(a,b)
}
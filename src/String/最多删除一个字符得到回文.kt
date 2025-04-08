package String

/**
 * 题目:给定一个字符串,请判断如果最多从字符串中删除一个字符能
 * 不能得到一个回文字符串。例如,如果输入字符串"abca",由于删除字符'b'
 * 或'c'就能得到一个回文字符串,因此输出为 true。
 */



fun aiwja(a:String){
    var temp=0
    var i=0
    var j=a.length-1
    while (i<j){
        if(a[i]==a[j]){
            i++
            j--
        }else{
            println(a[i])
            i++
        }
    }
}

fun main(){
    var a="abcca"
    aiwja(a)
}
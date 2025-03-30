package integer.Binary



fun dectoBi(n:Int):Int{
    var yushu=n
    var count=0
    var bi= mutableListOf<Int>()
    if(n==0) return 0
    if (n==1)return 1
    while (yushu>0){
        if(yushu%2==1) count++
        yushu=yushu/2
    }
    return count
}
fun main(){
    val n= readlnOrNull()?.toInt()
    for (i in 0..n!!){
        println(dectoBi(i))
    }
}
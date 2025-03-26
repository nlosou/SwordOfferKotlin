package integer

import kotlin.math.pow


/**
*题目:输入 2 个 int 型整数,它们进行除法计算并返回商,要求不得使
 * 用乘号'*'、除号'/'及求余符号'%'。当发生溢出时,返回最大的整数值。假设
 * 除数不为 0。例如,输入 15 和 2,输出 15/2 的结果,即 7。
 **/

//O(n)
fun function1(a:Int,b:Int):Int
{
    var count=0
    var yuushu:Int=Int.MAX_VALUE
    var jianshu=a
    while (yuushu>b){
        yuushu=jianshu-b
        jianshu=yuushu
        count++
    }
    return count
}

//O(logn)

fun function2(a:Int,b:Int) :Int
{
    var a=a
    var b=b
    var count=0
    if (isNegativeNumber(a)){
        count++
        a *= -1
    }
    if (isNegativeNumber(b)){
        count++
        b*=-1
    }
    var peichushu=a
    var chushi=b
    var ans=0
    var result=a
    while (result>b)
    {

       for (i in  1..Int.MAX_VALUE)
       {
           if (peichushu<b*Math.pow(b.toDouble(),i.toDouble())){
               //println(Math.pow(b.toDouble(),(i-1).toDouble()))
               chushi= b*Math.pow(b.toDouble(),(i-1).toDouble()).toInt()
               ans=ans+Math.pow(b.toDouble(),(i-1).toDouble()).toInt()
               break
           }
       }
        peichushu=peichushu-chushi
        result=peichushu
    }
    if (count==0) return ans
    else if(count==1) return ans*-1
    return ans
}

fun isNegativeNumber(a: Int):Boolean
{
    return a < 0
}

fun main()
{
    println(function2(15,1))
}

package integer.Binary

/**
 *题目:输入两个表示二进制的字符串,请计算它们的和,并以二进制
 * 字符串的形式输出。例如,输入的二进制字符串分别是"11"和"10",则输出
 * "101"。
 */
fun binaryAdd(a:String,b:String): MutableList<Int> {
    var ans = mutableListOf<Int>()
    if (a.length == b.length) {
        for (i in a.length - 1 downTo 0) {
            //println(a[i].digitToInt())

        val temp=a[i].digitToInt()+b[i].digitToInt()
            if (temp==0){
                ans.add(0)
            }else if (temp==1) {
                ans.add(1)
            } else{
                    ans.add(0)
                ans.add(1)
            }
        }
    }
    return ans
}
fun main()
{
    var a= readlnOrNull()
    var b= readlnOrNull()
    var ans= mutableListOf(0)
    a?.let { b?.let { it1 ->
         ans=binaryAdd(it, it1)} }

    for (i in ans.size-1 downTo 0)
    {
        print(ans[i])
    }

}

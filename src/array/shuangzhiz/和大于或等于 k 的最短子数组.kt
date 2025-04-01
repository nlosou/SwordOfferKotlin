package array.shuangzhiz

import com.sun.source.tree.WhileLoopTree


fun function(array: IntArray,k:Int): MutableMap<List<Int>, Int> {
    var i=0
    var j=i
    var ans= mutableMapOf<List<Int>,Int>()
    while (j<array.size){
        var sum=0
        for (index in i..j){
            sum+=array[index]
        }
        if(sum<k)
        {
            j++
        }else{
            val temp= mutableListOf<Int>()
            for (index in i..j){
                temp.add(array[index])
            }
            ans[temp]=temp.size
            i++
        }

    }

    return ans
}
fun function3(array: IntArray,k:Int){

}
fun max(a:Int,b:Int):Int{
    return if (a>b) a
    else b
}
fun main(){
    var array= intArrayOf(5,1,4,3,7)
    var min=Int.MAX_VALUE
    var index= mutableListOf<Int>()
    for (i in function(array,7)){
        if (i.value<min){
            min=i.value
            index= i.key.toMutableList()
        }
    }
    println("$min,$index")

    }
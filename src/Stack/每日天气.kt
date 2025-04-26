package Stack

fun main(){
    val array= intArrayOf(35,31,33,36,34)
    var ans= IntArray(array.size)
    var stack= mutableListOf<Int>()
    for (i in array.indices){
        while (stack.isNotEmpty()&&array[i]>array[stack.last()]){
            ans[stack.last()]=i-stack.last()
            stack.removeLast()
        }
        stack.add(i)
    }
    ans.forEach {
        print("$it ")
    }
}
package array.Accumulate




fun main(){
    var array= intArrayOf(1,7,3,6,2,9)
    var total=0
    array.forEach {
        total+=it
    }
    var sum=0
    for (i in 0..array.size-1)
    {
        sum+=array[i]
        if (sum-array[i]==total-sum){
            println(i)
        }
    }
}
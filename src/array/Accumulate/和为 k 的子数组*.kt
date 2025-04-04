package array.Accumulate



fun fuction6(array: IntArray,k:Int): MutableMap<List<Int>, Int> {
    var temp= mutableMapOf<List<Int>,Int>()
    var j=0
    var k=0
    var sum=0
    while (j<array.size){
            if (j==0){
                sum+=array[j]
            }else{
                sum=array[j]+ temp[listOf(0,j-1)]!!
            }

        temp[listOf(0,j)]=sum
        k++
        j++
    }
    for ( i in temp){
        if(i.value==k){
            println(i.key)
        }
    }
    println(temp.toList().toString())
    return temp
}
fun main(){
    var array= intArrayOf(1,1,1)
    var k=2
    fuction6(array,k)

}
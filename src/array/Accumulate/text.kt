fun main(){
    var array= intArrayOf(1,2,3,4,5,6)
    var array2=array.filter {
        it>3
    }
    println(array2)
    println(array.toList()-array2)
}
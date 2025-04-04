package array.String



fun countzinu(a:String,b:String):Boolean{
    var array= mutableMapOf<Int,Int>()

    for ( i in 'a'.code..'z'.code)
    {
        array[i]=0
    }
    a.forEach {
        array[it.code] = array[it.code]!! + 1
    }
    var i=0
    var j=i+1
    array[b[i].code] = array[b[i].code]!! - 1
    array[b[j].code] = array[b[j].code]!! - 1
    while (j<b.length-1){
        var count=0
        j++
        array[b[j].code] = array[b[j].code]!! - 1
        array[b[i].code] = array[b[i].code]!! + 1
        i++
        array.forEach {
            if(it.value==0) count++
        }
        if (count==26){
            return true
        }
    }
    return false

}

fun main(){
    var s1="ac"
    var s2="dgchafl"
    println(
    countzinu(s1,s2)
    )
    println('a'.code)
}
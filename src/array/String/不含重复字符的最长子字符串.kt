package array.String

import kotlin.system.measureNanoTime
import kotlin.time.measureTime


fun sjhsjs(a:String){
    val ans= mutableListOf<String>()
    val array = ('a'.code..'z'.code).associateWith { 0 }.toMutableMap()
    var i=0
    var j=0
    while (j<a.length){
        val charCode = a[j].code
        array[charCode] = array.getValue(charCode) + 1

        while (array.getValue(charCode) > 1) {
            array[a[i].code] = array.getValue(a[i].code) - 1
            i++
        }
        ans.add(a.substring(i, j + 1))
        j++
    }
    val res = ans.maxByOrNull { it.length } ?: ""
    println(res)
}

fun sjhsjs2(a: String) {
    val array = mutableMapOf<Int, Int>().withDefault { 0 }
    val ans = mutableListOf<String>()
    var i = 0
    var j = 0

    while (j < a.length) {
        val charCode = a[j].code
        array[charCode] = array.getValue(charCode) + 1

        while (array.getValue(charCode) > 1) {
            array[a[i].code] = array.getValue(a[i].code) - 1
            i++
        }

        ans.add(a.substring(i, j + 1))
        j++
    }

    val res = ans.maxByOrNull { it.length } ?: ""
    println(res)
}

fun main(){
    val a="babccabcd"
    val text1= measureNanoTime {
        sjhsjs(a)
    }
    val text2= measureNanoTime {
        sjhsjs2(a)
    }
    println(text1)
    println(text2)
}
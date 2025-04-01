package array.shuangzhiz
fun threeSum(array: IntArray) {
    array.sort()
    for (i in 0 until array.size - 2) {
        if (i > 0 && array[i] == array[i - 1]) continue // 外层去重
        var index1 = i + 1
        var index2 = array.size - 1
        while (index1 < index2) {
            val sum = array[i] + array[index1] + array[index2]
            when {
                sum == 0 -> {
                    println("${array[i]}, ${array[index1]}, ${array[index2]}")
                    // 内层去重
                    while (index1 < index2 && array[index1] == array[index1 + 1]) index1++
                    while (index1 < index2 && array[index2] == array[index2 - 1]) index2--
                    index1++
                    index2--
                }
                sum < 0 -> index1++
                else -> index2--
            }
        }
    }
}
fun main(){
    val array= intArrayOf(-1,0,1,2,-1,4)
    var arrayTemp=array.sortedArray()
    threeSum(arrayTemp)
}
package array.shuangzhiz



fun function4(array: IntArray, k: Int) {
    var product = 1
    var left = 0
    val n = array.size

    for (right in 0 until n) {
        product *= array[right]

        // 如果乘积大于等于k，移动左指针缩小窗口
        while (left <= right && product >= k) {
            product /= array[left++]
        }

        // 如果窗口有效，计算当前窗口的所有子数组
        if (left <= right) {
            val windowSize = right - left + 1
            for (i in 0 until windowSize) {
                val subArray = array.slice(left + i..right)
                println(subArray.toList())
            }
        }
    }
}


fun main(){
    var array= intArrayOf(10,5,2,6)
    var k=100
    function4(array,k)

}
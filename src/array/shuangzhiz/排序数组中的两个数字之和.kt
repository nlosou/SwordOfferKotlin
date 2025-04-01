package array.shuangzhiz

/**
 *题目:输入一个递增排序的数组和一个值 k,请问如何在数组中找出两
 * 个和为 k 的数字并返回它们的下标?假设数组中存在且只存在一对符合条
 * 件的数字,同时一个数字不能使用两次。例如,输入数组[1, 2, 4, 6, 10],k
 * 的值为 8,数组中的数字 2 与 6 的和为 8,它们的下标分别为 1 与 3。
 */


fun two_add(array:IntArray,k:Int): IntArray {
    var p1=0
    var p2=array.size-1

    while (p1<p2){
        if(array[p1]+array[p2]==k){
            return  intArrayOf(p1,p2)
        }
        else if(array[p1]+array[p2]>k){
            p2--
        }
        else{
            p1++
        }
    }
    return intArrayOf(0)

}
fun two_add2(array: IntArray,k: Int){
    array.forEachIndexed { index, i ->
        if(array.contains(k-i)){
            println(index)
            return
        }
    }
}
fun two_add3(array: IntArray, k: Int) {
    val seen = HashSet<Int>()
    array.forEach { num ->
        if (seen.contains(k - num)) println("Pair: $num, ${k - num}")
        seen.add(num)
    }
}
fun main(){
    val array= intArrayOf(1,2,4,6,10)
    var k=10
    two_add3(array,k)
}
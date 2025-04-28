package Queue

import java.util.*

class MovingAverage(size: Int) {
    private val nums: Queue<Int> = LinkedList()
    private val capacity = size
    private var sum = 0

    fun next(`val`: Int): Double {
        nums.offer(`val`)
        sum += `val`
        if (nums.size > capacity) {
            sum -= nums.poll()
        }
        return sum.toDouble() / nums.size
    }
}
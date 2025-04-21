package Stack

data class Stack<T>(var data:T?,var next: Stack<T>?)

class stackOp(data: Any){
    var node=Stack(data,null)
}
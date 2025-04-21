package Stack

fun main(){
    var data= arrayOf("2","1","+","3","*")
    var stack= mutableListOf<Int>()
    data.forEach {
        if(it.toIntOrNull() is Int){
            stack.add(it.toIntOrNull()!!)
        }else{
            when(it){
                "*"->{
                    var a=stack.last()
                    stack.removeLast()
                    var b=stack.last()
                    stack.removeLast()
                    stack.add(a*b)
                }
                "+"->{
                    var a=stack.last()
                    stack.removeLast()
                    var b=stack.last()
                    stack.removeLast()
                    stack.add(a+b)
                }
                "-"->{
                    var a=stack.last()
                    stack.removeLast()
                    var b=stack.last()
                    stack.removeLast()
                    stack.add(a-b)
                }
                "/"->{
                    var a=stack.last()
                    stack.removeLast()
                    var b=stack.last()
                    stack.removeLast()
                    stack.add(a/b)
                }
            }

        }
    }
    println(stack.last())
    println(stack.size)
}
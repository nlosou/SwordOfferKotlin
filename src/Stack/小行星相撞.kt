package Stack

fun main(){
    var data= intArrayOf(-16,4,5,-6,4,8,-5)
    var stack= mutableListOf<Int>()
    data.forEach {
        while (stack.isNotEmpty()&&stack.last()>0&&stack.last()<-it){
            stack.removeLast()
        }
        if (stack.isNotEmpty()&&it<0 && stack.last()==-it){
            stack.removeLast()
        }else if(it>0 ||stack.isEmpty()||stack.last()<0){
            stack.add(it)
        }
    }
    stack.forEach {
        print("$it ")
    }
}
package String



fun sada(a:String):Boolean{
    var i=0
    var j=a.length-1
    while (i<j){
        if (!a[i].isLetter()) i++
        if(!a[j].isLetter()) j--

        if(a[i].isLetter()&&a[j].isLetter()){
            if(a[i].uppercaseChar() !=a[j].uppercaseChar()) return false
            else{
                i++
                j--
            }
        }
    }
    return true
}


fun main(){
    var a="Was it a cat I saw?"
    if(sada(a)) println("yes")
    else println("no")
}
fun main(args: Array<String>){
    // null:variable which has no value
    var text: String? = null // to assign null use '?'
//    println(text?.length) //safe call operator - '?' , similar to if
//    println(text!!.length)

    text = "this variable is not null"
    val text2 = text?:"the variable is null"
    println(text2)

    var text3 = ""
    if(text != null){
        text3 = text
    } else{
        text3 = "this variable is null"
    }
}
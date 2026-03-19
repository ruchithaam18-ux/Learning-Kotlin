fun main() {
    // function overload
    val max = getMax(5, 7,10 )
    println(max)
}

fun getMax(a: Int, b: Int) = if (a > b) a else b // :Int can be used for-the data type of the return type
fun getMax(a: Double, b: Double) = if (a > b) a else b
fun getMax(a: Int, b: Int, c:Int) :Int{
    return if (a>=b && a>=c) a else if (b>=c && b>=c) b else c
}

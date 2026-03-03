fun main(args: Array<String>){
    val Number = 2.5 // double is the default type
    // val a: Float = 2.5 ==> its default value will be double only so it shows error
    val myNumber = 2.5f // lowercase f or uppercase can be used
    val mySecondNumber = 2.5 // double
    println("myNumber = $myNumber and mySecondNumber = $mySecondNumber")
    val a = 2F
    val b = 2
    println("a = $a, b = $b")// a is float and b is int
    //val b1: Double = 2 this gives error as it's and int value and there is no d to double, no suffix in double
    val x = 2F
    val y = 2.0
    println("x = $x, y = $y")// x is float and y is double
}
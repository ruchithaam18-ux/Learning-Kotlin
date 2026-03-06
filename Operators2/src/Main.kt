fun main(args: Array<String>) {
    // Logical AND operator
    println("***Logical AND operator***")
    val isPlaying = true
    val score = 100
    if (isPlaying && score == 100) {
        println("Next Level Opened")
    } else {
        println("Still at the same level")
    }
    // LOGICAL OR operator
    println("***Logical OR operator***")
    val num1 = -5
    val num2 = -4
    val text = if (num1 > 0 || num2 > 0) "the condition is true " else 0
    println("$text")
    println("if statement without {}")
    if (num1 > 0 || num2 > 0)
        println("$num1,$num2")// this will not be printed if the condition is false
        println("This text will be printed")
}
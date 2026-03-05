fun main(args : Array<String>){
    var x = 5
    val y = 3
    val sum = x+y
    // here we are doing operations
    /* aaa
    this is a multi line
    comment*/
    println("x+y = ${x+y}") // using placeholder - we can use expressions
    println("x-y = ${x-y}")
    println("x*y = ${x*y}")
    println("x/y = ${x/y}")
    println("x%y = ${x%y}")
    println()
    var a = 5
    val b= 3.0
    println("a+b = ${a+b}") // using placeholder - we can use expressions
    println("a-b = ${a-b}") // using placeholder - we can use expressions
    println("a*b = ${a*b}") // using placeholder - we can use expressions
    println("a/b = ${a/b}") // using placeholder - we can use expressions
    println("a%b = ${a%b}") // using placeholder - we can use expressions
    println()
    var result = a+b
    result +=2
    println("new result after adding 2 is: $result")

    result -=2
    println("new result after subtracting 2 is: $result")

    result *=2
    println("new result after multiplying 2 is: $result")

    result /=2
    println("new result after dividing it by 2 is: $result")

    result %=2
    println("the remainder for this division is: $result")

    println("3+3*4=${3+3*4}") // multiplication has precedence over addition
    println("(3+3)*4=${(3+3)*4}")

    // increment and decrement
    var q = 0
    println("q = ${q++}") // first returns the value of x and then increments it
    println("q = ${++q}") // brackets{} should be used or it shows error
    println("q = ${q--}")
    println("q = ${--q}")
    // if else
    val isActive = true // True - case-sensitive
    if (!isActive)// !(not equal to means it prints the else part)
    {
        println("The user is active")
    }
    else
    {
        println("The user is not active")
    }
    // if else if
    val myNumber = 10
    if(myNumber>=100){
        println("The number is greater than or equal to  100")
    }
    else if (myNumber>90){
        println("The number is greater than 90")
    }
    else{
        println("All the conditions failed!!")
    }
    // <,>,<=,>= operators
    val marks = 90
    if(marks<=35){
        println("SORRY YOU DID NOT PASS!! BETTER LUCK NEXT TIME")
    }
    else if(marks>35){
        println("YOU PASSED!! CONGRATULATIONS")
    }
    else if(marks!=100){
        println("NOT A CENTUM ")
    }
    else if(marks==100){
        println("CENTUM!!")
    }
}
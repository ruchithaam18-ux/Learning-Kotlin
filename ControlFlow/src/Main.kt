fun main(args:Array<String>){
    val alarm = 7
   val text =  when{
        alarm ==8|| alarm ==7 -> "The time is $alarm"
        alarm <= 10  -> "The number is in the range 1..10"
        else -> "The time is $alarm"
    }
    println(text)
    val text2 = when (alarm) {
        in 1..11 -> "the number is in the range 1..11"
        12 -> "the number is 12"
        else ->"the time is $alarm"
    }
    println(text2)
}
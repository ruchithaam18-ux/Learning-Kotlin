fun main(args: Array<String>){
    sayHello( "Alex",22)
    val hasInternetConnection = false
    if(hasInternetConnection){
        getData(data = "some data")
    }else{
        showMessage()
    }
}
fun sayHello(name:String,age: Int){
    //age = 30 - val cannot be reassigned
    var number = age
    number = 20
    println("Hello $name! Your age is $age")
}
fun getData(data:String){
    println("Your data is: $data")
}
fun showMessage(){
    println("there is no internet connection")
}
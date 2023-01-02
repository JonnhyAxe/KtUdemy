package ch_34_others


fun main(args: Array<String>) {
    val value = "Testing my strings"
    if(value is String)
        println("This string has ${value.length} characters")


    val myCar: Car = getCar()
//    if(myCar !is ch_34_others.BMW)
//        println("This is not my favourite brand")

//    if(myCar is ch_34_others.BMW)
//        (myCar as ch_34_others.BMW).drive()

    val bmwCar = myCar as? BMW
    bmwCar?.drive()
}

open class Car {}
class BMW: Car() {
    fun drive() {
        println("Driving my ch_34_others.BMW")
    }
}

fun getCar(): Car = BMW()
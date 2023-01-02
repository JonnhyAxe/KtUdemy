package ch_26_oop

fun main(args: Array<String>) {
    val myCar = Car3()
}

class Car3 {
    val model = "BMW"
    val topSpeed = 100

    init {
        println("This car is a $model and has a top speed of $topSpeed")
    }
}
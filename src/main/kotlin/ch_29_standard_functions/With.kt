package ch_29_standard_functions

fun main(args: Array<String>) {
    with(Car()) {
        speed = 80
        drive()
        println("Car is driving")
    }
}

class Car {
    var speed = 50
    fun drive() {
        println("Driving at $speed")
    }
}
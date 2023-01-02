package ch_29_standard_functions

fun main(args: Array<String>) {
    val newCar = NewCar().run {
        speed = 70
        drive()
        println("ch_29_standard_functions.NewCar is driving")
        this
    }
    println(newCar)

    run {
        val car2 = NewCar()
        car2.speed = 50
        car2.drive()
    }
//    println(car2)
}

class NewCar {
    var speed = 10
    fun drive() {
        println("ch_29_standard_functions.ch_32_generics.ch_34_others.ch_26_oop.Car is driving at $speed")
    }
}
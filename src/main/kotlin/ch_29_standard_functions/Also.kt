package ch_29_standard_functions

fun main(args: Array<String>) {
    Car().apply {
        speed = 80
        drive()
    }
        .also {car ->
            println("ch_29_standard_functions.ch_32_generics.ch_34_others.ch_26_oop.Car is running")
            println("ch_29_standard_functions.ch_32_generics.ch_34_others.ch_26_oop.Car speed is ${car.speed}")
        }
}
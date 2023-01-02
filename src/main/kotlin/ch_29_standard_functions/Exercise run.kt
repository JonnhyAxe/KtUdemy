package ch_29_standard_functions

fun main(args: Array<String>) {
    Laptop().run {
        turnOff()
        turnOn()
    }
}

class Laptop {
    fun turnOff() {
        println("Turning laptop OFF")
    }
    fun turnOn() {
        println("Turning laptop ON")
    }
}
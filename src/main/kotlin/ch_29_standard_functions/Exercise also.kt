package ch_29_standard_functions

fun main(args: Array<String>) {
    Car2().apply {
        buildCar()
    }
        .also {
            println("LOG: Building the car $it")
            println("Sending a message to the police that car $it has been built")
        }
}

class Car2 {
    fun buildCar() {
        println("Building a car")
    }
}
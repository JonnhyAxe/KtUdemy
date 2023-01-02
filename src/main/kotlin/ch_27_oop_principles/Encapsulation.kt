package ch_27_oop_principles

fun main(args: Array<String>) {

}

open class Airplane {
    public val type = "Airbus"

    public fun fly() {
        println("lying")
    }
}

class MyAirplane: Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar() {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}
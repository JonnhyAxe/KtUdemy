package ch_28_interfaces

fun main(args: Array<String>) {
    val factory = CarFactory()
    val myCar: Car = factory.provideCar()

    myCar.speed = 90
    myCar.drive()
    myCar.park()
}

interface Car {
    var speed: Int
    fun drive()
    fun park()
}

class BMW: Car {
    override var speed: Int = 250

    override fun drive() {
        println("ch_28_interfaces.ch_34_others.BMW is driving at $speed kph")
    }

    override fun park() {
        println("ch_28_interfaces.ch_34_others.BMW is parking")
    }

}

class CarFactory {
    fun provideCar(): Car {
        return BMW()
    }
}
package ch_26_oop

fun main(args: Array<String>) {
//    val myCar = Car("BMW", 220)
    val myCar = Car()
    val yourCar = Car("BMW")
    val hisCar = Car("Fiat", 220)
}

//class Car(var model: String, var topSpeed: Int) {
//}

class Car {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    var model: String? = null
    var topSpeed = 100
}
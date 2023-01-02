package ch_25_oop

fun main(args: Array<String>) {
    val boeing737 = Boeing()
    val a320 = Airbus()

    boeing737.speed = 700
    a320.speed = 800

    boeing737.name = "737"
    a320.name = "a320"

    boeing737.ascend()
    a320.descend()
    boeing737.descend()
    a320.ascend()
    a320.ascend()
    boeing737.descend()
}

open class Airplane {
    var name = "Airplane"
    var speed = 1000
    var altitude = 20000

    fun ascend() {
        altitude += 1000
        println("$name has an altitude of $altitude and speed $speed")
    }

    fun descend() {
        altitude -= 1000
        println("$name has an altitude of $altitude and speed $speed")
    }
}

class Boeing: Airplane() {
}

class Airbus: Airplane() {
}
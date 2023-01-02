package ch_30_class_type

fun main(args: Array<String>) {
    val myComputer = Computer()
    myComputer.bootUp()
}

class Computer {

    fun bootUp() {
        println("Booting up computer")
        val os = OperatingSystem()
        os.startOS()
        println("Computer ready")
    }

    inner class OperatingSystem {
        fun startOS() {
            println("OS started")
        }
    }
}
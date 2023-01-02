package ch_26_oop

fun main(args: Array<String>) {
    println(Car4.provideDrivingInstructions())
}

class Car4 {
    companion object {
        fun provideDrivingInstructions() : String {
            return "Drive safe!"
        }
    }
}
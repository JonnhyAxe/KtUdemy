package ch_31_extensions

fun main(args: Array<String>) {
    Double.printClassName()
}

fun Double.Companion.printClassName() {
    println("This is a Double class")
}
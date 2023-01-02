package ch_31_extensions

fun main(args: Array<String>) {
    val name = "Michael"
    println(name.betterLength)
}

val String.betterLength: Int
    get() = 200
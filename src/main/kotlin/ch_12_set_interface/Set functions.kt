package ch_12_set_interface

fun main(args: Array<String>) {
    val numbers = setOf(3, 6, 4, null, 8)
    println(numbers.size)

    println(numbers.contains(4))
    println(numbers.contains(5))

    println(numbers.containsAll(setOf(4, 6)))

    println(numbers.isEmpty())
    println(setOf<Int>().isEmpty())
}
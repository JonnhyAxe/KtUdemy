package ch_13_map_interface

fun main(args: Array<String>) {
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3,"three"))
    println(count)

    val count2 = mapOf<Int, String>()
    println(count2)

    println(count[2])

    println(count.keys)

    println(count.values)
}
package ch_11_list_interface

fun main(args: Array<String>) {
    val colors = arrayListOf("blue", "red", "blue", "green")
    colors.set(1, "redder")
    println(colors)
    val subColors = colors.subList(1, 3)
    println(subColors)
    println(subColors::class.java)

    colors.clear()
    println(colors)
    println(colors.isEmpty())
}
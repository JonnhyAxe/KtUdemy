package ch_7_operators_booleans

fun main(args: Array<String>) {
    val isDay = true
    val isEvening = true
    println(isDay && isEvening)

    println(false || false)

    val isNight = !isDay
    println(isNight)
}
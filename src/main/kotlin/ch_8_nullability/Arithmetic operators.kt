package ch_8_nullability

fun main(args: Array<String>) {
    val a: Double? = 10.0
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))
}
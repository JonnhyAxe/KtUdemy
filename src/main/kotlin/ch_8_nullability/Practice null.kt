package ch_8_nullability

fun main(args: Array<String>) {
    var a: String? = "I like dogs"
    println(a?.substring(3, 6))

    var b: Double? = 13.94
    b = b?.times(6)
    println(b?.toFloat())

    var userName = readLine()
    println(userName?.length)
}
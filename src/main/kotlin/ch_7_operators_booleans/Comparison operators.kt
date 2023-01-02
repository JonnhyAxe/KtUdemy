package ch_7_operators_booleans

fun main(args: Array<String>) {
    val a = 5
    val b = 1
    println("$a > $b will return ${a > b}")

    println(a<b)
    println(a>=b)
    println(a<=b)

    println(a==b)

    val result = a!=b

    println(result)
}
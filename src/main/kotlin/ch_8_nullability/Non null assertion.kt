package ch_8_nullability

fun main(args: Array<String>) {
    var catName: String? = null
    println(catName!!.length)
}
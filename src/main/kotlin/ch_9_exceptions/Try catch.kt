package ch_9_exceptions

import java.lang.Exception

fun main(args: Array<String>) {
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("An exception happened \n ${e.localizedMessage}")
        e.printStackTrace()
    }
}
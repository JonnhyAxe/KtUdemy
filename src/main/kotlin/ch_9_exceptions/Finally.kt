package ch_9_exceptions

import java.lang.Exception

fun main(args: Array<String>) {
    val test = readLine()
    try {
        println(test?.toInt()) //TODO: add defensive code to nullable variables
    } catch (e: Exception) {
        println("An exception has occurred")
        e.printStackTrace()
    } finally {
        println("The execution has completed")
    }
}
package ch_9_exceptions

import java.lang.Exception

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main(array: Array<String>) {
    val s: Nothing? = null
    try {
        s = null ?: fail("Name required")
    } catch (e: Exception) {
        //println(s!!::class.simpleName)     // 's' is known to be initialized at this point
    }

}
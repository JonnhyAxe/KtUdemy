package ch_33_coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(2000L)
        println("World!")
    }
    print("Hello, ")
    Thread.sleep(3000L)
}
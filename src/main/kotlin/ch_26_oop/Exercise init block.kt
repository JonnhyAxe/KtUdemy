package ch_26_oop

fun main(args: Array<String>) {
    val browser = WebBrowser()
}

class WebBrowser {
    init {
        println("Web browser is connecting")
        println("http://www.google.com/")
    }
}
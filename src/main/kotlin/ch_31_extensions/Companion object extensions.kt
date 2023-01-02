package ch_31_extensions

fun main(args: Array<String>) {
    Book.printMe()
}

class Book {
    companion object {}
}

fun Book.Companion.printMe() {
    println("ch_30_extensions.ch_26_oop.Book has been printed")
}
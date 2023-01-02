package ch_4_strings_variables

fun main(args: Array<String>) {
    val catName = "My cat's name is \"Fluffy\""
    println("The catName variable length is ${catName.length}")

    var myCar = "My car won't start"
    println(myCar.substring(3, 6))

    var clientName = "John"
    println("Hello $clientName welcome to the store.")

    val apples = 3
    val oranges = 6
    println("The total number of fruit is ${apples + oranges}")
}
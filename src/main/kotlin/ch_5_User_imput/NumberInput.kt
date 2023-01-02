package ch_5_User_imput

fun main(args: Array<String>) {
    println("Input a number")
    val userInput = readLine()?:"0"
    println("Double is: ${userInput.toInt() * 2}")
}

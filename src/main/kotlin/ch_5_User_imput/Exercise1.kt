package ch_5_User_imput

fun main(args: Array<String>) {
    println("Please enter your birth year")
    val yearInput = readLine()?:""
    val year = yearInput.toInt()
    val age = 2019 - year
    println("Your age is either ${age-1} or $age")
}
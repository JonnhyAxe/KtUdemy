package lambdasinaction_ch5

import lambdasinaction_ch4.menu

fun main(array: Array<String>) {

    if (isVeganMenu())
        println("Vegetarian friendly")

    println(isHealthyMenu())
    println(isHealthyMenu2())

    var dish = findVeganDish()
    print("${dish?.name}")
}

fun isVeganMenu() = menu.any { it.vegetarian }
fun isHealthyMenu() = menu.all { it.calories < 1000 }
fun isHealthyMenu2() = menu.none { it.calories >= 1000 }
fun findVeganDish() = menu.find { it.vegetarian }
package lambdasinaction_ch5

import lambdasinaction_ch4.Dish
import lambdasinaction_ch4.menu

fun main(array: Array<String>) {

    val numbers1: IntArray = intArrayOf(2, 3, 5, 7, 11, 13, 10)
    val numbers2: IntArray = intArrayOf(6, 7, 8)

    //create an matrix
    val pairs = numbers1
            .flatMap { num -> numbers2.map { intArrayOf(num, it) } }
            .toList()

    pairs.forEach { pair -> println("(" + pair[0] + ", " + pair[1] + ")") }

    val calories = menu.sumOf { it.calories }
    println("Number of calories:$calories")

    val maxOfCalories = menu.maxOf { it.calories }
    println("Max of calorie $maxOfCalories");


}
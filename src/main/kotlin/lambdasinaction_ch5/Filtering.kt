package lambdasinaction_ch5

import lambdasinaction_ch4.Dish
import lambdasinaction_ch4.menu

fun main(array: Array<String>) {

    val numbers: IntArray = intArrayOf(1, 2, 1, 3, 3, 2, 4)
    numbers
        .filter { it % 2 == 0 }
        .distinct()
        .forEach { print(it) }

    var listResult = arrayListOf<Dish>()
    menu.filter { it.calories > 300 }
        .drop(2)
        .toCollection(listResult)

    println(listResult)

}
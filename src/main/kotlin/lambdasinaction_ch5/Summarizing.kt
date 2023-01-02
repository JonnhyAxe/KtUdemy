package lambdasinaction_ch5

import lambdasinaction_ch4.Dish
import lambdasinaction_ch4.menu

fun main() {
//fun main(args: Array<String>) {

    println("Nr. of dishes: ${howManyDishes()}")
    println("The most caloric dish is: ${findMostCaloricDish()}")
    println("The most caloric dish is: ${findMostCaloricDishWithComparator()}")
    println("Total calories in menu: ${calculateTotalCalories()}")
    println("Average calories in menu: ${calculateAverageCalories()}")
    println("Short menu: ${getShortMenu()}")
    println("Short menu comma separated: ${getShortMenuCommaSeparated()}")

}

fun howManyDishes() = menu.count()
fun findMostCaloricDish() = menu.reduce { d1, d2 -> if(d1.calories > d2.calories) d1 else d2 }
fun compareByCalories () = compareBy<Dish> { dish:Dish -> dish.calories  }
fun findMostCaloricDishWithComparator() = menu.
    groupingBy { it }.
    reduce { _, a, b ->  maxOf(a,b, compareByCalories()) }
fun calculateTotalCalories() = menu.sumOf { it.calories }
fun calculateAverageCalories() = menu.map { it.calories }.average()
fun getShortMenu() = menu.map { it.name }.joinToString { it }
fun getShortMenuCommaSeparated() = menu.map { it.name }.joinToString(",")


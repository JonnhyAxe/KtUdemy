package lambdasinaction_ch5

import lambdasinaction_ch4.Dish
import lambdasinaction_ch4.menu

fun main(array: Array<String>) {


    println("Dishes grouped by type: " + groupDishesByType())
    println("Dish names grouped by type: " + groupDishNamesByType())
   /* println("Dish tags grouped by type: " + groupDishTagsByType())*/
   /* println("Caloric dishes grouped by type: " + groupCaloricDishesByType())*/
   /* println("Dishes grouped by caloric level: " + groupDishesByCaloricLevel())*/
   /* println("Dishes grouped by type and caloric level: " + groupDishedByTypeAndCaloricLevel())*/
   /* println("Count dishes in groups: " + countDishesInGroups())*/
   /* println("Most caloric dishes by type: " + mostCaloricDishesByType())*/
   /* println("Most caloric dishes by type: " + mostCaloricDishesByTypeWithoutOprionals())*/
   /* println("Sum calories by type: " + sumCaloriesByType())*/
   /* println("Caloric levels by type: " + caloricLevelsByType())*/

}

fun groupDishesByType() = menu.groupBy { dish: Dish -> dish.type }
fun groupDishNamesByType() = menu.groupBy { dish: Dish -> dish.type }.mapValues {  }

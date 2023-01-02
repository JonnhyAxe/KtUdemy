package lambdasinaction_ch5

import lambdasinaction_ch4.menu

fun main(args: Array<String>) {
    println("Dishes partitioned by vegetarian: ${partitionByVegetarian()}")
}

fun partitionByVegetarian() = menu.partition { it.vegetarian }
//fun vegetarianDishesByType()= TODO
//fun mostCaloricPartitionedByVegetarian()= TODO


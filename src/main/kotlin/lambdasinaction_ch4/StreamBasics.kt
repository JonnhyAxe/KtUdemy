package lambdasinaction_ch4


val menu : List<Dish> = arrayListOf(Dish("pork", false, 800, Type.MEAT),
                                     Dish("beef", false, 700,  Type.MEAT),
                                     Dish("chicken", false, 400,  Type.MEAT),
                                     Dish("french fries", true, 530,  Type.OTHER),
                                     Dish("rice", true, 350,  Type.OTHER),
                                     Dish("season fruit", true, 120,  Type.OTHER),
                                     Dish("pizza", true, 550,  Type.OTHER),
                                     Dish("prawns", false, 400,  Type.FISH),
                                     Dish("salmon", false, 450,  Type.FISH))

val dishTags:Map<String, List<String>> = hashMapOf("pork" to listOf("greasy", "salty"),
                                                    "beef" to listOf("salty", "roasted"),
                                                    "chicken" to listOf("fried", "crisp"),
                                                    "french fries" to listOf("greasy", "fried"),
                                                    "rice" to listOf("light", "natural"),
                                                    "season fruit" to listOf("fresh", "natural"),
                                                    "pizza" to listOf("tasty", "salty"),
                                                    "prawns" to listOf("tasty", "roasted"),
                                                    "salmon" to listOf("delicious", "fresh"))

fun main(array: Array<String>) {
    getLowCaloricDishesNamesInJava8(menu)
            .forEach { println(it) }
}

fun getLowCaloricDishesNamesInJava8(dishes: List<Dish>): List<String> {
    return dishes
                .filter { d -> d.calories < 400 }
                .sortedBy { it.calories }
                .map { it.name }
                .toList()
}

enum class Type { MEAT, FISH, OTHER }

class Dish (var name: String, var vegetarian: Boolean, var calories: Int, var type: Type) {}
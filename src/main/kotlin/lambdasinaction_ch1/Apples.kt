package lambdasinaction_ch1

import java.lang.Exception


fun main(array: Array<String>){

    val inventory = arrayListOf(Apple(80, "green"),
                                Apple(155, "green"),
                                Apple(120, "red"))

    //No Lambda usage
    val result = filterApples(inventory)
    println(result)

    //lambda usage, order by preference
    val greenApples = filterApples(inventory, ::isGreenApple)
    println(greenApples)
    val greenApplesInline = filterApples(inventory) { isGreenApple(it) }
    println(greenApplesInline)
    val greenApplesInline2 = filterApples(inventory) { "green" == it.color }
   greenApplesInline2.forEach { println(it.toString()) }


    val heavyApples = filterApples(inventory, ::isHeavyApple)
    print(heavyApples)
    val heavyApplesInline = filterApples(inventory)  { it.weight < 80 || "brown" == it.color }
    print(heavyApplesInline)
}

fun filterApples(inventory: ArrayList<Apple>, test: (Apple) -> Boolean ): List<Apple> {
    val result = arrayListOf<Apple>()
    for (apple in inventory){
        if(test(apple)){
            result.add(apple)
        }
    }
    return result
}

fun filterApples(inventory: ArrayList<Apple>): List<Apple> {
    val result = arrayListOf<Apple>()
    for (apple in inventory){
        if("green" == apple.color){
            result.add(apple)
        }
    }
    return result
}

fun isGreenApple(apple: Apple) = "green" == apple.color
fun isHeavyApple(apple: Apple) = apple.weight > 150


class Apple (var weight:Int, var color: String ){}
package lambdasinaction_ch5

import kotlin.math.min

fun main(array: Array<String>) {

    val numbers = listOf(3, 4, 5, 1, 2)
    val reduce = numbers.reduce { num1, num2 -> num1 + num2 }
    println("number: $reduce")

    val reduce2 = numbers.reduce(sum)
    println("number2: $reduce2")

    val reduceMax = numbers.reduce(::maxOf)
    print("Reduced Max: $reduceMax")

    val reduceMin = numbers.reduce(::min)
    print("Reduced Min: $reduceMin")

    //print("Total calories in menu: " + calculateTotalCalories())
}

//TODO: why val???
val sum: (Int, Int) -> Int = { x, y -> x + y }

//fun calculateTotalCalories() = menu.reduce{ d1, d2 -> d1.calories + d2.calories }

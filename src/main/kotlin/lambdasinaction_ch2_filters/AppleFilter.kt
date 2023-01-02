package lambdasinaction_ch2_filters



fun main(array: Array<String>) {

    var inventory = arrayListOf(AppleFilter(80, "green"), AppleFilter(135, "green"), AppleFilter(120, "red"))

    var greenApples = inventory.filter { apple -> isGreen(apple) }
    println(greenApples)

    var overweight = inventory.filter { apple -> isOverWeight(apple) }
    println(overweight)
}

fun isGreen(apple: AppleFilter) = "green" == apple.color
fun isOverWeight(apple: AppleFilter) = apple.weight > 150

class AppleFilter(var weight: Int, var color: String) {}
package lambdasinaction_ch3

fun main(array: Array<String>) {

    var apples = arrayListOf(AppleSorting(80,"green"),
                            AppleSorting(155, "green"),
                            AppleSorting(120, "red"))

    val isEvenWeigh = ApplePredicate { it.weight % 2 == 0 }

    var applesGreen = filterApples(apples, isEvenWeigh);
    println(applesGreen)
    var sortedApplesByWeight = apples.sortedBy { it.weight }

    println(sortedApplesByWeight)
}

fun filterApples(inventory: ArrayList<AppleSorting>, applePredicate: ApplePredicate): List<AppleSorting> {
    val result = arrayListOf<AppleSorting>()
    for (apple in inventory){
        if(applePredicate.test(apple)){
            result.add(apple)
        }
    }
    return result
}

class AppleSorting (var weight: Int, var color: String) {

    override fun toString() = "{color=${this.color}, color=${this.weight}}"
}

// https://kotlinlang.org/docs/fun-interfaces.html
fun interface ApplePredicate {
    fun test(apple: AppleSorting): Boolean
}

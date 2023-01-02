package ch_16_expressions

fun main(args: Array<String>) {
    if(326/72*15+93%13 == 62) {
        println("ch_25_oop.Math is easy")
    } else {
        println("ch_25_oop.Math is hard")
    }

    val haveCat = true
    val haveCatFood = false
    if(haveCat && haveCatFood) {
        println("ch_34_others.Cat is happy")
    } else {
        println("Oh no!")
    }

    val age = 18
    if(age >= 18) println("Can drink alcohol") else println("Illegal to drink alcohol")
}
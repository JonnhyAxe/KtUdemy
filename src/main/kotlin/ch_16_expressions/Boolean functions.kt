package ch_16_expressions

fun main(args: Array<String>) {
    val animals = arrayListOf<String>()
    if(animals.isEmpty()) {
        animals.add("dog")
    }
    println(animals)

    val animals2 = arrayListOf("cat")
    if(animals2.add("horse")) {
        println("Horse was successfully added")
    }
}
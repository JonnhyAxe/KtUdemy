package ch_29_standard_functions

fun main(args: Array<String>) {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
//        .let { filteredList ->
//            println(filteredList)
//            println("Size of list is ${filteredList.size}")
//        }
        .let(::println)

    val name = readLine()
    name?.let {
        println("Your name is $it")
    }
}
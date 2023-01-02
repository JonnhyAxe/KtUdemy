package ch_29_standard_functions

fun main(args: Array<String>) {
//    println("Input a number")
//    val input = readLine()
//    input?.let {
//        val number = it.toInt()
//        println("The double of your number is ${number * 2}")
//    }

    val animals = arrayListOf<String?>()
    for(i in 1..3) {
        println("Input an animal")
        val input = readLine()
        input?.let {
            if(it == "") {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        it?.let {//only prints if animal name is NOT null
            println("Feeding the $it")
        }
    }
}
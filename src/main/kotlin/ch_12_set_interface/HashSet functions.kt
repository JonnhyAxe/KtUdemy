fun main(args: Array<String>) {
    val numbers = hashSetOf(3, 7, 5, 4, 6)
    val newNumbers = setOf(7, 2, 5, 9, 6)

    numbers.retainAll(newNumbers)
    println(numbers)

    numbers.clear()
    println(numbers)
    println(numbers.isEmpty())
}
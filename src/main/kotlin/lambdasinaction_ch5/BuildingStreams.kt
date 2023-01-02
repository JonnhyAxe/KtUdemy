package lambdasinaction_ch5

import kotlin.random.Random


fun main(array: Array<String>) {

    //convert to UpperCase
    var streamStr = arrayListOf<String>("Java 8", "Lambdas", "In", "Action")
    streamStr.map { it.uppercase() }.forEach { println(it) }


    //empty List
    val emptyList = arrayListOf<String>()

    //primitive array - https://kotlinlang.org/docs/arrays.html#primitive-type-arrays
    val x: IntArray = intArrayOf(2, 3, 5, 7, 11, 13)
    println(x.sum())

    var count = 0
    generateSequence { (count++) }
        .take(10)
        .forEach { print(it.toString()) }

    val sequence = generateSequence {
        (count--).takeIf { it > 0 } // will return null, when value becomes non-positive,
        // and that will terminate the sequence
    }

    println()
    println(sequence.toList())

    fun indexSequence(): Sequence<Int> = generateSequence(0) { it + 1 }
        indexSequence().take(10).forEach { print(it) }

    generateSequence(intArrayOf(0, 1)) { intArrayOf(it[1], it[0] + it[1]) }
        .take(10)
        .forEach { println("(" + it[0] + ", " + it[1] + ")") }

    generateSequence { Random.nextInt(100) }
        .take(10)
        .forEach { print(it) }
    println()
    generateSequence { 1 }
        .take(5)
        .forEach { print(it) }
    println()

    /*
    long uniqueWords = Files.lines(Paths.get("lambdasinaction/chap5/data.txt"), Charset.defaultCharset())
    .flatMap(line -> Arrays.stream(line.split(" ")))
    .distinct()
        .count();
        */

}
package lambdasinaction_ch5

fun main(array: Array<String>) {

    //kotlin is not lazy :)
    val numbers: IntArray = intArrayOf(2, 3, 5, 7, 11, 13, 10)
    var listResult = numbers
        .filter {
            print("filtering $it ")
            it % 2 == 0
        }.map {
            print("mapping $it ")
            it * it
        }.take(2)
        .toList()

    println(listResult)
}
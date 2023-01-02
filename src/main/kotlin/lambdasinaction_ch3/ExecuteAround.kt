package lambdasinaction_ch3

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.lang.Exception

private const val filePath = "lambdasinaction/chap3/data.txt"


fun main(array: Array<String>) {

    try {
        readFileLineByLineUsingForEachLine(filePath)
    } catch (e: Exception) {}

    // method we want to refactor to make more flexible
    val result: String = processFileLimited()
    println(result)

    var oneLineLambda = BufferedReaderProcessor { b: BufferedReader? -> b!!.readLine() }
    val oneLine: String = processFile(oneLineLambda)
    println(oneLine)

    var twoLineLambda = BufferedReaderProcessor { b: BufferedReader? -> b!!.readLine() + b!!.readLine() }
    var twoLines: String = processFile(twoLineLambda)
    println(twoLines)

}

fun readFileLineByLineUsingForEachLine(fileName: String)
        = File(fileName).forEachLine { println(it) }


@Throws(IOException::class)
fun processFileLimited(): String {

    var br = BufferedReader(FileReader(filePath))
    br.use {
        return br.readLine()
    }
}

@Throws(IOException::class)
fun processFile(p: BufferedReaderProcessor): String {
    var br =  BufferedReader( FileReader(filePath))
    br.use {
        return p.process(br)
    }
}

// https://kotlinlang.org/docs/fun-interfaces.html
fun interface BufferedReaderProcessor {
    @Throws(IOException::class)
    fun process(b: BufferedReader?): String
}

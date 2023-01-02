package ch_24_packages.com.exercise.client

import ch_24_packages.com.exercise.hello.sayHi

fun getName() {
    println("Please enter a client name")
    val name = readLine()?:""
    sayHi(name)
}
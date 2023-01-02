package ch_25_oop

class Customer public constructor(name: String) {
}

sealed interface Error // has implementations only in same package and module

sealed class IOError(): Error // extended only in same package and module
open class CustomError(): Error // can be extended wherever it's visible
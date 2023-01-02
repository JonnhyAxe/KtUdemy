fun main(args: Array<String>) {
    sayHello(arrayListOf("Alice", "Bob", "Carol", "Dan"))
        {name: String -> println("Hello there $name")}
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}
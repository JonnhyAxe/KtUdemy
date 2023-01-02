package ch_34_others

fun main(args: Array<String>) {
    lateinit var networkService: String
    networkService = getNetworkService2()
    println(networkService)
}

fun getNetworkService2() = "Network service"
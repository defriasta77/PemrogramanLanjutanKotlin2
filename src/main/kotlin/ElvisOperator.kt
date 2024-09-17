fun main(args: Array<String>) {
    //Elvis Operator ?:
    var maybeWelcome: String? = "Hello World"
    println(maybeWelcome?.length ?: 0)
}
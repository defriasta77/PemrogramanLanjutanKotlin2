fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    println(maybeNumber?.times(2) ?: "maybeNumber is null")

    maybeNumber = null
    println(maybeNumber?.times(2) ?: "maybeNumber is null ")
}

/*var s1 = "Hello"
var s2: String? = "World"
println(s1.length)
println(s2.length)*/
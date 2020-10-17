package functionstudy

//
fun makeAppender(init: String="") : (String) -> String {
    var str = init

    return {
        str = str + it
        str
    }
}

//
fun makeCounter() : () -> Int {
    var counter = 0

    return {
        counter++
        counter
    }
}

fun main(args : Array<String>) {
    val counter = makeCounter()
    println(counter())
    println(counter())

    val appender = makeAppender()
    println(appender("Hello"))
    println(appender(" World"))
}
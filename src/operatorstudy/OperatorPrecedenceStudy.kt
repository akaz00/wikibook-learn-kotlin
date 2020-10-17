package operatorstudy

fun main(args : Array<String>) {
    println(true || 2 < 1)

    var result = ((10 * 5) in 1 .. 100) || (true && false)
    println(result)
}

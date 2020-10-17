package challenges.ch03

fun main(args : Array<String>) {
    /*
    var a = 100
    var b = /* 값 */
    var c = "Kotlin"
    var d = /* 값 */

    var true1 = (a /* 비교 연산자 */ b)
    var true2 = (b >= a) && (c != d)
    */

    var a = 100
    var b = 100
    var c = "Kotlin"
    var d = "Java"

    var true1 = (a >= b)
    var true2 = (b >= a) && (c != d)

    println(true1)
    println(true2)
}
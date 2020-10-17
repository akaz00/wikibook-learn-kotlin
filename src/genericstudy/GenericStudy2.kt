package genericstudy

fun<T> myPrint(prefix: String, target:T) = println("$prefix$target")

// Number이거나 Number 클래스를 상속받고 있는 타입으로 전달값을 제한
fun <T: Number> numberToDouble(num: T) = num.toDouble()


fun main(args : Array<String>) {
    myPrint<String>("prefix : ", "Hello")
    myPrint(">> ", 1234)

    println(numberToDouble(1))
    println(numberToDouble(1.5f))
    println(numberToDouble(2L))
    // println(numberToDouble("Hello"))

    var list = listOf<Int>(1, 2, 3)
    var map = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
}
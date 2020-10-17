package classstudy_part1

class MethodOverloadingClass {
    fun overloadingTest() = println("overloading test 1")
    fun overloadingTest(x: Int) = println("overloading test 2")
    fun overloadingTest(x: Int, y: Int) = println("overloading test 3")
    fun overloadingTest(x: Int, y: Double) = println("overloading test 4")
    fun overloadingTest(x: Double, y: Int) = println("overloading test 5")
}

fun main(args : Array<String>) {

    MethodOverloadingClass().overloadingTest()
}
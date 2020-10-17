package classstudy_part2

object SingletonClass {
    var x: Int = 0

    fun increaseX() = x++
    fun printX() = println(x)
}

fun main(args : Array<String>) {

    SingletonClass.x = 100
    SingletonClass.increaseX()
    SingletonClass.increaseX()
    SingletonClass.printX()
}
package exceptionstudy

class MyClass {
    fun myMethod() {
        val a = 1 / 0
    }
}

fun myFunction() {
    val c = MyClass()
    c.myMethod()
}

fun main(args : Array<String>) {
    myFunction()
}
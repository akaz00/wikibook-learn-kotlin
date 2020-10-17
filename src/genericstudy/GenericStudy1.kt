package genericstudy

class BoxForInt(var content: Int) {
    fun replace(content: Int) {
        this.content = content
    }
    fun get(): Int {
        return content
    }
}

class BoxForString(var content: String) {
    fun replace(content: String) {
        this.content = content
    }
    fun get(): String {
        return content
    }
}

class Box<T>(var content:T) {
    fun replace(content: T) {
        this.content = content
    }
    fun get(): T {
        return content
    }
}

data class MyPair<FirstType, SecondType>(var first: FirstType, var second: SecondType)

fun main(args : Array<String>) {
    /*
    val boxInt = BoxForInt(4)
    val boxString = BoxForString("Hello")
    println(boxInt.get())
    println(boxString.get())
    boxInt.replace(100)
    println(boxInt.get())
    */

    val boxGenericInt = Box<Int>(4)
    val boxGenericString = Box("Hello")
    println(boxGenericInt.get())
    println(boxGenericString.get())
    boxGenericInt.replace(100)
    println(boxGenericInt.get())

    val pair1 = MyPair<Int, String>(100, "Hello")
    println(pair1.first)
    println(pair1.second)

    val pair2 = MyPair("World", 3.5)
    println(pair2.first)
    println(pair2.second)

    var triple = Triple<Int, String, Double>(1, "Hello", 3.0)
}
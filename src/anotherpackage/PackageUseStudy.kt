package anotherpackage

import mypackage.MY_CONSTANT
import mypackage.sayHello
import mypackage.MyClass

fun main(args : Array<String>) {
    println(MY_CONSTANT)
    sayHello("김철수")
    var c = MyClass()
    c.print()
}


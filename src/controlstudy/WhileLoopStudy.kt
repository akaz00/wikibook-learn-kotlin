package controlstudy

fun main(args : Array<String>) {
    // while 구문
    var a = 1
    while(a <= 10) {
        println(a)
        // a++
    }
    println("after while : $a")

    println("do while test")
    // do - while 구문
    a = 1
    do {
        println(a)
        a++
    } while(a <= 10)
}
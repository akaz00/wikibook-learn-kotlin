package variablestudy

fun main(args : Array<String>) {
    var score: Int
    score = 100

    println("정수형 값의 최소/최대값")
    println("Byte min : ${Byte.MIN_VALUE} max : ${Byte.MAX_VALUE}")
    println("Short min : ${Short.MIN_VALUE} max : ${Short.MAX_VALUE}")
    println("Int min : ${Int.MIN_VALUE} max : ${Int.MAX_VALUE}")
    println("Long min : ${Long.MIN_VALUE} max : ${Long.MAX_VALUE}")

    println("실수형 값의 최소/최대값")
    println("Float min : ${Float.MIN_VALUE} max : ${Float.MAX_VALUE}")
    println("Double min : ${Double.MIN_VALUE} max : ${Double.MAX_VALUE}")
}
package functionstudy

fun multiplyTwo(n : Int) = n * 2
fun multiplyThree(n : Int) = n * 3
fun isEven(n: Int) = (n % 2) == 0
fun printReverse(s : String) = println(s.reversed())

class StringAppender(init: String) {
    var result = init

    //
    fun append(s : String) {
        result += s
    }

    class Inner {
        companion object {
            fun myPrintln(any: Any) = println("${any.toString()}")
        }
    }

    companion object {
        fun myPrintln(any: Any) = println("${any.toString()}")
    }
}

fun main(args : Array<String>) {
    // 직접 정의한 Top-level 함수 참조
    // (1)
    var myMultiplyFuncRef : (Int) -> Int = ::multiplyTwo
    println(myMultiplyFuncRef(2))

    // (2)
    myMultiplyFuncRef = ::multiplyThree
    println(myMultiplyFuncRef(2))

    // (3)
    var isEvenRef = ::isEven
    println(isEvenRef(2))

    listOf("Hello", "World").forEach(::printReverse)

    // (1)
    val appender = StringAppender("")
    // "객체이름::메소드"의 형태로 참조
    listOf("Hello", "World").forEach(appender::append)
    println(appender.result)

    // (2)
    var myPrintlnRef = (StringAppender)::myPrintln
    myPrintlnRef("Hello World")

    myPrintlnRef = (StringAppender.Inner)::myPrintln
    myPrintlnRef("Hello World")

    // Overload resolution ambiguity 에러 발생
    // 함수 오버로딩의 결과로 여러 타입의 값을 받을 수 있는 다양한 함수가 정의되어 있으므로 임의로 타입 추론이 불가능함
    // var printlnRef = ::println
    // 따라서 직접 함수 타입을 명시하는 방식으로 함수 대입
    var printlnRef : (Any) -> Unit = ::println
    printlnRef("Hello World By Function Reference")
}
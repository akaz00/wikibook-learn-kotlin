package exceptionstudy

import java.io.File
import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NumberFormatException

fun main(args : Array<String>) {
    // NumberFormatException 예외 발생
//    var toInt = "Hello".toInt()
//    println(toInt)


//    print("숫자 입력 : ")
//    var input = readLine()
//    var toNum = input?.toInt()
//    println(toNum)


    // KotlinNullPointerException 예외가 발생
//    var nullValue: String? = null
//    nullValue!!.toInt()


    // FileNotFoundException 예외가 발생
//    var s = File("hello.txt").inputStream()


    // ClassCastException 예외가 발생
//    var anyValue: Any = "Hello"
//    var intValue = anyValue as Int


//    while(true) {
//        try {
//            print("숫자 입력 : ")
//            var input = readLine()
//            var toNum = input?.toInt()
//            println(toNum)
//            break
//        } catch(e: NumberFormatException) {
//            println("예외 메시지 : ${e.message}")
//            e.printStackTrace()
//        }
//    }
}
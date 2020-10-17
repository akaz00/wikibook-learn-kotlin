package exceptionstudy

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NumberFormatException

fun main(args : Array<String>) {
    // 여러 catch 블록을 이용한 예외 처리
//    try {
//        print("숫자 입력 : ")
//        var arr = arrayOf(1, 2, 3, 4, 5)
//        var num = readLine()!!.toInt()
//        var div = (10 / num)
//        var arrVal = arr[num]
//        println("10 / $num = $div")
//        println("arr[$num] : $arrVal")
//    } catch(e: NumberFormatException) {
//        print("비정상적인 숫자 입력")
//    } catch(e: ArithmeticException) {
//        print("비정상적인 연산 작업 진행")
//    } catch(e: Exception) {
//        print("문제 발생 : ${e.message}")
//    }

    // 하나의 catch 블록을 이용한 모든 예외 처리
//    try {
//        print("숫자 입력 : ")
//        var num = readLine()!!.toInt()
//        var div = (10 / num)
//        println("10 / $num = $div")
//    } catch(e: Exception) {
//        print("문제 발생 : ${e.message}")
//    }

    // catch 블록의 정의 순서 주의
//    try {
//        print("숫자 입력 : ")
//        var arr = arrayOf(1, 2, 3, 4, 5)
//        var num = readLine()!!.toInt()
//        var div = (10 / num)
//        var arrVal = arr[num]
//        println("10 / $num = $div")
//        println("arr[$num] : $arrVal")
//    } catch(e: Exception) {
//        print("문제 발생 : ${e.message}")
//    } catch(e: NumberFormatException) {
//        print("비정상적인 숫자 입력")
//    } catch(e: ArithmeticException) {
//        print("비정상적인 연산 작업 진행")
//    }
}
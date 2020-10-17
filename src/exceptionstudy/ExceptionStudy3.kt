package exceptionstudy

import kotlin.math.sqrt

fun mySqrt(v: Double) : Double {
    if(v < 0) {
        throw Exception("음수(${v})의 제곱근을 구할 수 없습니다.")
    }
    return sqrt(v)
}

fun main(args : Array<String>) {
    try {
        // 정상 작동
        println(mySqrt(4.0))
        // 음수 값을 전달했으므로 예외가 발생
        println(mySqrt(-1.0))
    } catch(e: Exception) {
        println("예외 발생 : ${e.message}")
    }
}
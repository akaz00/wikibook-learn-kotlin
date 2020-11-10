package classstudy_part2

import java.math.BigDecimal
import java.math.BigInteger
import kotlin.math.*

fun main(args : Array<String>) {

    /* 수학 */
    // kotlin.math 패키지 사용
    // 상수
    println(E) // 2.718281828459045
    println(PI) // 141592653589793

    // 절대값(abs)
    val minusTen = -10
    println(abs(minusTen)) // 10 출력
    println(minusTen.absoluteValue) // 10 출력

    // 반올림 함수
    println(round(0.5)) // 0.0 출력
    println(round(0.51)) // 1.0 출력

    // 올림 함수
    println(ceil(0.1)) // 1.0 출력

    // 내림 함수
    println(floor(0.9)) // 0.0 출력

    // 제곱 함수
    val base = 2.0
    println(base.pow(3)) // 8 출력

    // 제곱근 함수
    println(sqrt(4.0)) // 2 출력
    println(sqrt(2.0)) // 1.414213... 출력

    // 삼각함수
    println(sin(Math.toRadians(90.0))) // 1.0
    println(cos(Math.toRadians(90.0))) // 0에 가까운 아주 작은 값 출력
    println(tan(Math.toRadians(45.0))) // 0.999... (약간의 오차가 발생)

    // 큰 정수를 다룰 수 있는 BigInteger 클래스
    val bi1 = BigInteger("10000000000000000000") // 1000경
    val bi2 = BigInteger("10000000000000000000")

    val bi3 = bi1 + bi2
    val bi4 = bi1 * bi2

    println(bi3)
    println(bi4)

    // 데이터 소실 발생 유의
    println(bi4.toLong())
    // 데이터의 소실이 발생하는 경우 예외 발생하도록 유도
    // println(bi4.longValueExact())

    val bi5 = bi1 - bi2
    // 아무 문제 없이 변환 가능
    println(bi5.longValueExact())

    // 미세한 값의 오차 발생
    println(0.03 - 0.02)
    println(BigDecimal("0.03") - BigDecimal("0.02"))

    var sum = 0.0
    for(i in 0..9999) {
        sum += 0.0001
    }
    println(sum)

    var sumBd = BigDecimal("0.0")
    for(i in 0..9999) {
        sumBd += BigDecimal("0.0001")
    }
    println(sumBd)

    // 16진수 변환 및 역변환
    var intToHex = 16711680.toString(16)
    val hexToInt = intToHex.toInt(16)
    println(intToHex)
    println(hexToInt)
}

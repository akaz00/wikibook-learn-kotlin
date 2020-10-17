package challenges.ch02

fun main(args : Array<String>) {
    // 정수, 실수 타입 변수 선언
    var num1 = 1
    var num2 = 2.5

    // 타입 변환 이후 더하기
    var num = num1.toDouble() + num2
    println(num)

    // String template을 이용하여 더하기 작업 수행
    println("${num1.toDouble() + num2}")
}

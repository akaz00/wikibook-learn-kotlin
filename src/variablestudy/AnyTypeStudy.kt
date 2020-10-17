package variablestudy

fun main(args : Array<String>) {
    // Any 타입 변수 선언
    var anyValue: Any

    // 숫자 대입
    anyValue = 100
    // 타입 출력
    println(anyValue::class.simpleName)

    // 문자열 대입
    anyValue = "Hello"
    println(anyValue::class.simpleName)

    // 숫자(실수형 타입) 대입
    anyValue = 1.234
    println(anyValue::class.simpleName)

    // Any 타입 배열을 선언하면 모든 종류의 값을 저장할 수 있음
    var anyTypeArr: Array<Any> = arrayOf(1, 1.234, "Hello")
}
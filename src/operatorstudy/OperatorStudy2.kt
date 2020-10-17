package operatorstudy

fun main(args : Array<String>) {
    // 비교 연산자
    // 두 값이 같은지 여부를 판단하고 있으므로 참(true)을 반환
    var r1 = (1 == 1)
    // 두 값이 같지 않은지 여부를 판단하고 있으므로 거짓(false)을 반환
    var r2 = (1 != 2)
    // 문자열의 값이 서로 일치하는지 여부를 판단하고 있으므로 참(true)을 반환
    var r3 = ("Hello" == "Hello")
    // 문자열의 길이가일치하는지 여부를 판단하고 있으므로 참(true)을 반환
    var r4 = ("Hello".length == "World".length)
    // 값의 대소 비교
    var r5 = 2 > 1
    var r6 = 2 >= 2

    println("(1 == 1) : $r1")
    println("(1 != 2) : $r2")
    println(""""Hello" == "Hello" : $r3""")
    println(""""Hello".length == "World".length : $r4""")
    println("(2 > 1) : $r5")
    println("(2 >= 2) : $r6")

    // 논리 연산자 (logical operator)
    // AND 연산자 사용
    // 두 값이 모두 참이므로 true를 반환
    var r7 = true && true
    // 두 값 중 하나가 거짓이므로 false를 반환
    var r8 = true && false

    // OR 연산자 사용
    // 두 값이 모두 거짓이므로 false를 반환
    var r9 = false || false
    // 두 값 중 하나가 참이므로 true를 반환
    var r10 = false || true

    // 부정 연산자 사용
    // 참 값을 거짓 값으로 변환
    var r11 = !true
    // 거짓 값을 참 값으로 변환
    var r12 = !false

    println("true && true : $r7")
    println("true && false : $r8")
    println("false || false : $r9")
    println("false || true : $r10")
    println("!true : $r11")
    println("!false : $r12")

    // 비교 연산자와 논리 연산자가 포함된 수식
    var result = ((2 > 1) && ("Hello" != "World"))
    println("$result")
}
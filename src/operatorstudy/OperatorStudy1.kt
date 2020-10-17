package operatorstudy

fun main(args : Array<String>) {
    // 산술 연산자 (mathematical operator)
    var sum = 5 + 8
    var sub = 4 - 6
    var mul = 3 * 5

    println("sum : $sum")
    println("sub : $sub")
    println("mul : $mul")

    // 두 피연산자 값이 정수 타입일 경우 반환될 값의 타입은 정수 타입
    var div = 6 / 5
    // 피연산자 값이 둘 다 실수이거나 적어도 하나의 값은 실수여야 결괏값으로 실수를 반환
    var divDouble1 = 6.0 / 5.0
    // toDouble 메서드(혹은 toFloat 메서드)를 호출해 정숫값을 실숫값으로 변환한 후 나누기 연산을 수행
    var divDouble2 = 6 / 5.toDouble()

    println("div : $div")
    println("divDouble1 : $divDouble1")
    println("divDouble2 : $divDouble2")

    // 6 / 5의 나머지는 1이므로 1을 반환
    var mod1 = 6 % 5
    // 3 / 3의 나머지는 0이므로 0을 반환
    var mod2 = 3 % 3

    println("mod1 : $mod1")
    println("mod2 : $mod2")

    // 소괄호를 이용해 복잡한 식을 연산 가능
    var complex = ((5 + 3) * (4 / 2)) % 3
    println("complex : $complex")

    // 변수도 사용 가능
    var v1 = 1
    var v2 = 2
    var result = (v1 + v2) + 10
    println("result : $result")

    // 연산시 오버플로우 주의
    var intValue1: Int = 2147483647
    println("before overflow : $intValue1")
    // 오버플로우 발생
    intValue1 = intValue1 + 1
    println("after overflow : $intValue1")

    // 연산시 언더플로우 주의
    var intValue2: Int = -2147483648
    println("before underflow : $intValue2")
    // 언더플로우 발생
    intValue2 = intValue2 - 1
    println("after underflow : $intValue2")

    // 대입 연산자 (assignment operator)
    // 단순 값 대입
    var value1 = 100

    // 수식의 결과값 대입
    var value2 = (1 + 3) * (20 / 5)

    // 메소드 호출 결과 대입
    var value3 = " Hello ".trim()

    // 복합 대입 연산자 (augmented assignment operator)
    var w1 = 10
    // w1 = w1 + 20 대입문과 같은 결과
    w1 += 20
    println("w1 += 20 : $w1")

    // w1 = w1 - 10 대입문과 같은 결과
    w1 -= 10
    println("w1 -= 10 : $w1")

    // w1 = w1 * 2 대입문과 같은 결과
    w1 *= 2
    println("w1 *= 2 : $w1")

    // w1 = w1 / 2 대입문과 같은 결과
    w1 /= 2
    println("w1 /= 2 : $w1")

    // w1 = w1 % 3 대입문과 같은 결과
    w1 %= 3
    // (20 / 3의 나머지는 2)
    println("w1 %= 2 : $w1")

    var value = 100

    // 값을 1증가(value += 1과 같은 결과)
    value++
    // 값을 1증가시켰으므로 101을 출력
    println("after value++ : " + value)

    // 값을 1감소(value -= 1과 같은 결과)
    value--
    // 값을 1감소시켰으므로 100을 출력
    println("after value-- : " + value)

    // - 연산자를 이용한 부호 변경
    println("-value : " + (-value))
    // - 연산자를 두 번 적용해 값의 부호를 원래대로 변경
    println("-(-(value)) : " + (-(-value)))
}
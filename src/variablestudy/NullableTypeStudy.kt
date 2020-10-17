package variablestudy

fun main(args : Array<String>) {
    // 기본적으로 null 값 대입을 허용하지 않는 타입(Int)으로 선언
    var num = 100
    // null 값 대입 불가(‘Null can not be a value of a non-null type Int’ 오류 발생)
    // num = null

    // null을 대입받을 수 있는 Int? 타입의 변수를 선언
    var a: Int? = 100
    // null 값 대입 가능
    a = null

    var s: String = "Hello"
    // 역시 null 값 대입 불가
    // s = null
    // NPE의 걱정 없이 안전하게 호출 가능
    println(s.length)

    var c: String? = null

    if(c != null) {
        println(c.length)
    }

    // let 함수를 이용한 null 타입값 접근
    c?.let {
        // 변숫값이 null이 아닐 경우 실행할 코드를 중괄호 블록에 작성
        println(it.length)
    }

    // 먼저 값을 상수에 대입
    val c2 = c
    if(c2 != null) {
        // c2는 상수이므로 값이 변경되지 않고, 따라서 c2의 값이 이후 블록에서 절대 null 값이 될 수 없음을 보장
        println(c2.length)
    }

    // 만약 c가 null이라면 length 프로퍼티 접근을 무시하고 null을 반환
    var len : Int? = c?.length
    println(len)

    // 왼쪽 피연산자의 값이 null이므로 오른쪽 피연산자값(1)을 반환
    var one = null ?: 1
    println(one)
    // 왼쪽 피연산자의 값이 null이 아니므로 왼쪽 피연산자값(2)을 그대로 반환
    var two = 2 ?: 1
    println(two)

    var result = c?.length ?: 0 // 만약 c가 null이 아니라면 length 프로퍼티 값 출력, 아니라면 대안값인 0을 반환
    println(result) // 0 출력

    var wrongNumberString = "숫자아님"
    // var wrong = wrongNumberString.toInt()

    var wrong2: Int? = wrongNumberString.toIntOrNull()
    println(wrong2)
}
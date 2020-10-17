package controlstudy

fun main(args : Array<String>) {
    var num = 1
    when(num) {
        1 -> println("One") // num의 값이 1일 경우
        (1.inc()) -> println("Two") // num의 값이 2일 경우
        (1 * 3) -> println("Three")  // num의 값이 3일 경우
        else -> println("No Match") // 1, 2 모두 아닐 경우 No Match 출력
    }

    println("--------------------")
    when(num) {
        1 -> {
            println("Hello")
            println(num)
        }
        2 -> {
            println("World")
            println(num)
        }
    }

    println("--------------------")
    var a = 10.0
    var b = 20.0
    var op = '+'
    val result: Double? = when(op) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> null
    }
    println(result)

    println("--------------------")
    var grade = "A+"
    var gradeResult = when(grade) {
        "A+", "a+", "A-", "a-" -> "수"
        "B+", "b+", "B-", "b-" -> "우"
        "C+", "c+", "C-", "c-" -> "미"
        "D+", "d+", "D-", "d-" -> "양"
        else -> "가"
    }
    println(gradeResult)

    println("--------------------")
    var x: Any = "Hello"
    // var x: Any = 1234
    // var x: Any = 1.234

    when(x) {
        // 문자열일 경우 문자열의 길이 출력
        is String -> println(x.length)
        // 숫자인 경우 2를 곱한 값 출력
        is Int -> println(x * 2)
        // 실수인 경우 정수 형태로 변환하여 출력
        is Double -> println(x.toInt())
        else -> println("No Match")
    }

    println("--------------------")
    // in을 사용하여 범위로 검색
    var score = 100
    var scoreResult = when(score) {
        in 91 .. 100 -> "A"
        in 81 .. 90 -> "B"
        in 71 .. 80 -> "C"
        else -> "D"
    }
    println(scoreResult)

    println("--------------------")
    var booleanValue: Boolean = true
    var bResult = when(booleanValue) {
        true -> "참"
        false -> "거짓"
    }
    println(bResult)

    println("--------------------")
    // var score = 100
    var gradeResult2 = when {
        // (2)
        (score == 100) -> "A"
        (score in 90 until 100) -> "B"
        (score in 80 until 90) -> "C"
        else -> "D"
    }
    println("grade : $gradeResult2")

}
package variablestudy

fun main(args : Array<String>) {
    // 일반 문자열 사용
    var str = "안녕하세요.\n\n문자열 안에 엔터나  스 페 이 스\t탭을 자유롭게 사용할 수\n있습니다.\n\n끝"
// Raw String 사용
    var raw = """안녕하세요.

문자열 안에 엔터나  스 페 이 스	탭을 자유롭게 사용할 수
있습니다.

끝"""
    println(str)
    println("------")
    println(raw)
    println("------")

    var num1 = 100
    var num2 = 200

    val strWithNum = "Hello, $num1"
    println(strWithNum)

    var greeting = "\n\t Hello \t\n"
    var trimmed = "trimmed : ${greeting.trim()}"
    println(trimmed)

    var sum = "sum : ${num1 + num2}"
    println(sum)
}
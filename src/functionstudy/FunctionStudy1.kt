package functionstudy

/*
// 함수 정의 영역에 printHello 함수 정의
// 전달받을 입력값이 없을 경우 빈 괄호를 씀
fun printHello() {
    println("Hello")

    // return 명령어를 실행하며 함수를 종료
    return
}
*/

// return 명령어를 생략한 printHello 함수
fun printHello() {
    println("Hello")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int {
    // 새로운 변수를 선언해서 전달받은 인자값에 2를 곱한 후 저장
    var c = a * 2
    var d = b * 2

    return c + d
}

// 표현식을 이용하여 함수 정의 가능
// fun sum(a: Int, b: Int): Int = a + b
fun getBigger(a: Int, b:Int) = if(a > b) a else b
fun getGrade(score: Int) = when(score) {
    in 91 .. 100 -> "A"
    in 81 .. 90 -> "B"
    in 71 .. 80 -> "C"
    else -> "D"
}
fun removeAllSpace(target: String) = target.replace(" ", "")

fun main(args : Array<String>) {
    printHello()

    println(sum(2, 4))
    println(getGrade(100))
    println(getGrade(90))
    println(removeAllSpace(" H e l l o "))
}

package challenges.ch07

fun String.countSpace() : Int {
    var count = 0
    for(c in this) {
        if(c == ' ') {
            count++
        }
    }
    return count
}

fun Double.toPair() : Pair<Int, Double> {
    var p1 = this.toInt()
    var p2 = this - p1
    return p1 to p2
}

fun main(args : Array<String>) {
    // 정수 1과 실수 0.5 값을 저장한 쌍 객체 생성
    var pair1 = 1 to 0.5
    // 문자열 "Hello"와 정수 1234 값을 저장한 쌍 객체 생성
    var pair2 = "Hello" to 1234

    // 한 개의 스페이스가 포함된 문자열
    println("Hello World".countSpace())
    // 여섯 개의 스페이스가 포함된 문자열
    println("Hello W o r l d Kotlin".countSpace())

    var d1 = 1.5
    var d2 = 3.14159

    println(d1.toPair())
    println(d2.toPair())
}
package controlstudy

fun main(args : Array<String>) {
    // Array 객체를 사용하여 반복
    var arr = arrayOf(1, 2, 3)

    // 1부터 3까지 배열의 요소를 차례대로 출력
    for(i in arr) {
        println(i)
    }

    // 리스트 객체를 순회
    var list = listOf(1, 2, 3)
    for(item in list) {
        println(item)
    }
    println("리스트 순회 완료")

    // 맵 객체를 순회
    var map = mapOf(1 to "a", 2 to "b", 3 to "c")
    for(pair in map) {
        println(pair)
    }
    println("맵 순회 완료")

    // 집합 객체를 순회
    var set = setOf("a", "b", "c")
    for(e in set) {
        println(e)
    }
    println("집합 순회 완료")

    var str = "Hello"
    // 각각의 문자('H', 'e', ..., 'o')를 출력
    for(c in str) {
        println(c)
    }
}
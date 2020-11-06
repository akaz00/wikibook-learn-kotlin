package operatorstudy

fun main(args : Array<String>) {
    // in 연산자
    // 1. 배열, 리스트, 집합 혹은 Range 객체에 특정 원소가 포함되어 있는지 검사하기 위해서 사용
    /* 배열 요소 포함 여부 검사 */
    var arr = arrayOf(1, 2, 3, 4, 5)
    // 3은 배열에 포함돼 있으므로 true를 반환
    println("3 in arr : " + (3 in arr))
    // 6은 배열에 포함돼 있지 않으므로 false를 반환
    println("6 in arr : " + (6 in arr))

    /* 리스트 요소 포함 여부 검사 */
    var list = listOf('a', 'b', 'c', 'd', 'e')
    // 'a' 글자는 리스트에 포함돼 있으므로 true를 반환
    println("'a' in list : ${'a' in list}")
    // 'f' 글자는 리스트에 포함돼 있지 않으므로 false를 반환
    println("'f' in list : ${'f' in list}")

    // .. 연산자를 이용하여 1부터 10까지의 범위 정보를 담고 있는 범위 객체 생성
    println(1 in 1 .. 10)
    var a = 10
    println(a in 1 .. 9)
    println('a' in 'a' .. 'z')

    println(1 !in 1 .. 10)

    // 2. 배열, 리스트, 집합 혹은 Range 객체에 특정 원소가 포함되어 있는지 검사하기 위해서 사용
    for(num in 1 .. 5) {
        print("$num ")
    }
    println()

    var items = arrayOf('a', 'b', 'c')
    for(item in items) {
        print(item)
    }
    println()

    for((idx, item) in items.withIndex()) {
        println("$idx : $item")
    }
}
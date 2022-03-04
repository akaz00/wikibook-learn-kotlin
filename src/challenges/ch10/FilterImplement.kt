package challenges.ch10

fun <T> List<T>.myFilter(predicate: (T) -> Boolean) : List<T> {
    val filtered = mutableListOf<T>()

    for(item in this) {
        if(predicate(item)) {
            filtered.add(item)
        }
    }

    return filtered
}

fun main(args : Array<String>) {
    // "H"로 시작하는 문자열만 필터링
    val result1 = listOf("Hello", "Banana", "World", "Hole").myFilter {
        it.startsWith("H")
    }
    println(result1)

    // 짝수 숫자만 필터링
    val result2 = listOf(1, 2, 3, 4, 5, 6).myFilter {
        it % 2 == 0
    }
    println(result2)
}
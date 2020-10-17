package challenges.ch04

fun main(args : Array<String>) {
    var original = arrayOf(1, 2, 3, 4, 5)
    var copy = Array(original.size){0}

    // 값 복사
    var idx = 0
    for(v in original) {
        copy[idx] = v
        idx++
    }

    // 복사된 배열의 값 출력
    for(v in copy) {
        print("$v ")
    }
}
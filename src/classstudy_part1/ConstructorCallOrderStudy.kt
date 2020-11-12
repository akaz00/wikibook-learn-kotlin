package classstudy_part1

// 주 생성자가 순서상 제일 먼저 실행됨
class ConstructorCallOrderDemo(a: Int) {
    // 주 생성자의 대입 작업이 끝난 이후 init 블록이 실행됨
    init {
        println("init")
    }

    // 보조 생성자는 init 블록의 코드가 실행된 이후 실행됨
    constructor(a: Int, b: Int) : this(a) {
        println("constructor(a: Int, b: Int)")
    }

    constructor(a: Int, b: Int, c: Int) : this(a, b) {
        println("constructor(a: Int, b: Int, c: Int)")
    }
}

fun main(args : Array<String>) {
    ConstructorCallOrderDemo(1, 2, 3)
}
package challenges.ch10

fun main(args : Array<String>) {
    val names = listOf("이황", "김철수", "신사임당", "이영희", "길동", "김영수")

    val mapped = names.map {
        it.length
    }
    println(mapped)

    val filtered1 = names.filter {
        it.startsWith("김")
    }
    println(filtered1)

    val filtered2 = names.filter {
        it.length == 2
    }
    println(filtered2)

    val count = names.count {
        it.length == 3
    }
    println(count)
}
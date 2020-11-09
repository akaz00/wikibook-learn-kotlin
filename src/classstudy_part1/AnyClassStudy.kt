package classstudy_part1

fun main(args : Array<String>) {
    var num = "Hello"
    println(num == "Hello")
    println(num.hashCode())
    println(num.toString())

    // 다양한 타입의 값을 저장하는 리스트에 저장될 타입을 Any로 추론
    // val list: List<Any> = listOf(1, 1.234, "Hello")
    // 다양한 타입의 키, 다양한 타입의 값을 저장하는 맵의 키, 값 타입을 Any로 추론
    // val map: Map<Any, Any> = mapOf(1 to "Hello", "Hello" to 100, 1.234 to 100L)

    val list = listOf(1, 1.234, "Hello")
    val map = mapOf(1 to "Hello", "Hello" to 100, 1.234 to 100L)
}
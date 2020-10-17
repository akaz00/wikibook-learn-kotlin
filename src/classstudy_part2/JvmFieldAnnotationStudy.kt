package classstudy_part2

class JvmFieldAnnotationDemo {
    // JvmField 어노테이션이 붙은 속성의 경우 게터, 세터가 아니라 직접 접근
    @JvmField var value1 = "Hello!"
    // JvmField가 없는 경우 게터와 세터 메소드를 통해서 접근
    var value2 = "Hello!"
}

fun main(args : Array<String>) {

    val demo = JvmFieldAnnotationDemo()
    println(demo.value1)
    println(demo.value2)
}
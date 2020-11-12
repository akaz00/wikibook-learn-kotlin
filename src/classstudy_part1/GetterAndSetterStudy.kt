package classstudy_part1

class GetterAndSetterDemo() {
    // (1)
    var num: Int = 0
        // (2)
        set(value) {
            println("값을 ${value}으로 설정")
            field = value
        }
        get() {
            println("${field}값을 반환")
            return field
        }
}

class Person6(val name: String, pAge: Int) {
    var age: Int = 0
        // (1)
        set(value) {
            when {
                value < 0 -> throw Exception("음수 나이는 허용되지 않습니다.")
                value > 200 -> throw Exception("나이가 비정상적으로 많습니다.")
            }
            field = value
        }

    var isMinor = pAge < 20
        // (2)
        get() = this.age < 20

    init {
        age = pAge
    }
}

fun main(args : Array<String>) {
    var demo = GetterAndSetterDemo()
    demo.num = 100
    println(demo.num)

    var p1 = Person6("김철수", 15)
    println(p1.name)
    println(p1.age)
    println(p1.isMinor)

    // var p2 = Person6("이영희", -1)
    // var p2 = Person6("이영희", 300)
    var p2 = Person6("이영희", 100)
    println(p2.name)
    println(p2.age)
    println(p2.isMinor)

}
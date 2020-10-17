package classstudy_part1

interface MyInterface {
    var prop: Int // (1)

    // 구현 메소드 선언
    fun concreteMethod(): Int {
        return 100
    }

    // (2) 추상 메소드 선언
    fun abstractMethod(): Int
}

class ClassImplementsMyInterface(prop: Int) : MyInterface {
    override var prop: Int = prop
        get() = field * -1
        set(value) {
            field = if(value <= 0) value * -1 else value
        }

    override fun abstractMethod(): Int {
        return 100
    }
}

fun main(args : Array<String>) {

    var c = ClassImplementsMyInterface(0)

    c.prop = -100
    println(c.prop)
    println(c.concreteMethod())
    println(c.abstractMethod())
}
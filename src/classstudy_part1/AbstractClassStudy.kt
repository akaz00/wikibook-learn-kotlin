package classstudy_part1

// abstract 키워드를 class 키워드 앞에 붙여 추상 클래스 선언
abstract class AbstractClass(var a:Int, var b: Int) {
    // (1)
    fun concreteMethod() {
        println("from concrete method")
    }

    // (2)
    abstract fun abstractMethod(arg: Int): Int
}

// (1)
class ConcreteClass(a: Int, b: Int, var c: Int) : AbstractClass(a, b) {
    // (2) 추상 메소드는 반드시 구현 필요 (미구현시 컴파일 에러 발생)
    override fun abstractMethod(arg: Int): Int {
        println("자식 클래스에서 추상 메소드 구현")
        return (arg + a + b + c)
    }
}

fun main(args : Array<String>) {

    // 에러 발생! (Cannot create an instance of an abstract class)
    // var a = AbstractClass(1, 2)

    // (2)
    var c = ConcreteClass(1, 2, 3)
    c.concreteMethod()
    // (3)
    var r = c.abstractMethod(100)
    println(r)
}
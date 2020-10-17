package classstudy_part2

// Outer 내부에 정의한 Inner 클래스는 Outer의 이름으로 접근해야 한다는 것 빼고 아예 서로 다른 클래스라고 생각해도 무방 (서로의 속성, 메소드에 접근 불가)
class Outer(var x: Int) {
    fun outerFunction() {
        println("x : $x")
    }

    // Outer 내부에 Inner 클래스 정의
    class Inner(var y: Int) {
        fun innerFunction() {
            // outerFunction() // 불가
            // println("x : $x") // 불가
            println("y : $y")
        }
    }
}

// inner 키워드와 함께 정의
class Outer2(var x: Int, var z: Int) {
    fun outerFunction() {
        println("x : $x")
    }

    // inner 키워드아 함께 Inner 클래스 정의
    inner class Inner(var x: Int, var y: Int) {
        fun innerFunction() {
            // 바깥 클래스의 속성, 메소드에 접근 가능 (this@바깥클래스이름 을 통해 바깥 인스턴스의 참조 접근 가능)
            this@Outer2.outerFunction()
            // 직접 호출도 가능
            // outerFunction()

            // 같은 이름의 속성이 있다면 Qualified this 표현식으로 구분 가능
            println("x : ${this.x}, x : ${this@Inner.x}")
            println("x : ${this@Outer2.x}, y : $y")

            println("z : ${z}")
        }

        fun getOuter(): Outer2 {
            return this@Outer2
        }
    }
}

class Outer3(var x: Int) {
    // (2)
    private var inner: Inner

    init {
        inner = Inner(100)
    }

    fun outerFunction() {
        println("x : $x")
        // (3)
        inner.innerFunction()
    }

    // (4)
    /*
    fun getInner() : Inner {
        return inner
    }
    */

    // (1)
    private class Inner(var y: Int) {
        fun innerFunction() {
            println("y : $y")
        }
    }
}

class Outer4 {
    interface InnerInterface {
        fun innerFunction()
    }
}

class MyClass : Outer4.InnerInterface {
    override fun innerFunction() {
        println("my implemented inner function")
    }
}

fun main(args : Array<String>) {

    /*
    var outer1 = Outer(10)
    var inner1 = Outer.Inner(20) // (1)

    println(outer1.x)
    outer1.outerFunction()
    // println(outer1.y) // 접근 불가
    // outer1.innerFunction() // 접근 불가

    println(inner1.y)
    inner1.innerFunction()
    // println(inner1.x) // 접근 불가
    // inner1.outerFunction() // 접근 불가
    */

    var outer2 = Outer2(10, 100)

    // o2의 인스턴스를 이용하여 Inner 클래스 인스턴스를 생성!
    var inner2 = outer2.Inner(20, 200)
    var inner3 = outer2.Inner(30, 300) // 여러 인스턴스 생성 가능

    // i2와 i3는 서로 다른 인스턴스
    println("inner2 === inner3 : ${inner2 === inner3}") // false
    // 그러나 같은 Outer2 참조를 공유
    println("inner2.getOuter() === inner3.getOuter() : ${inner2.getOuter() === inner3.getOuter()}") // true

    println("inner2.innerFunction()")
    inner2.innerFunction()
    println("inner3.innerFunction()")
    inner3.innerFunction()

    // i2, i3는 같은 Outer2 참조를 공유하므로 변경 사항이 모두에게 적용
    inner2.getOuter().x = 100
    println("inner2.innerFunction() (x에 100 대입 후)")
    inner2.innerFunction()
    println("inner3.innerFunction() (x에 100 대입 후)")
    inner2.innerFunction()
    inner3.innerFunction()


    var outer3 = Outer3(10)
    // var inner3 = Outer3.Inner(20) // 불가 (private)
    outer3.outerFunction()
}
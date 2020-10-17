package classstudy_part1

interface MyInterface1 {
    fun methodA()
    fun calc(x: Int, y: Int) = x + y
}

interface MyInterface2 {
    fun methodB()
    fun calc(x: Int, y: Int) = x * y
}

class MultipleInterfaceExtender : MyInterface1, MyInterface2 {
    override fun methodA() {
        println("methodA 구현")
    }

    override fun methodB() {
        println("methodB 구현")
    }

    override fun calc(x: Int, y: Int) : Int {
        /*
        // 같은 이름의 메소드를 상속받았으므로 어떤 메소드를 호출할 지 모호하여 에러가 발생
        // Many supertypes available, please specify the one you mean in angle brackets, e.g. 'super<Foo>'
        val calc = super.calc(x, y)
        return calc
        */
        val calc1 = super<MyInterface1>.calc(x, y)
        val calc2 = super<MyInterface2>.calc(x, y)
        return calc1 + calc2
    }
}

fun main(args : Array<String>) {

    var ext = MultipleInterfaceExtender()
    ext.methodA()
    ext.methodB()

    val result = ext.calc(2, 3)
    println(result)
}
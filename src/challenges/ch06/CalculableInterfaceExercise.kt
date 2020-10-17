package challenges.ch06

interface Calculable {
    fun calculate(x: Double, y: Double) : Double
}

class Add : Calculable {
    override fun calculate(x: Double, y: Double) = x + y
}

class Subtract : Calculable {
    override fun calculate(x: Double, y: Double) = x - y
}

fun doCalculation(c: Calculable, x: Double, y: Double) = c.calculate(x, y)

fun main(args : Array<String>) {
    var add = Add()
    var sub = Subtract()

    var res1 = doCalculation(add, 3.0, 4.0)
    var res2 = doCalculation(sub, 10.0, 4.0)

    println(res1)
    println(res2)

    // 익명 객체 생성 및 대입
    var mul = object : Calculable {
        override fun calculate(x: Double, y: Double) = x * y
    }
    var div = object : Calculable {
        override fun calculate(x: Double, y: Double) = x / y
    }

    var res3 = doCalculation(mul, 3.0, 4.0)
    var res4 = doCalculation(div, 10.0, 4.0)

    println(res3)
    println(res4)
}
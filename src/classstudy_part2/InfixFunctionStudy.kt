package classstudy_part2

class InfixDemoPerson(var name: String) {
    infix fun sayHelloTo(target: InfixDemoPerson) {
        println("${this.name}가 ${target.name}에게 인사합니다.")
    }
}

class InfixDemoNumber(var num: Int) {
    infix fun add(target: InfixDemoNumber) : InfixDemoNumber {
        return InfixDemoNumber(num + target.num)
    }

    infix fun add(target: Int) : Int {
        return num + target
    }

    override fun toString(): String {
        return num.toString()
    }
}

infix fun String.sayHelloTo(to: String) {
    println("${this}가 ${to}에게 인사합니다.")
}

fun main(args : Array<String>) {

    var p1 = InfixDemoPerson("김철수")
    var p2 = InfixDemoPerson("이영희")

    // (1)
    p1 sayHelloTo p2

    var n1 = InfixDemoNumber(100)
    var n2 = InfixDemoNumber(200)

    // (2)
    var sum1 = n1 add n2
    println(sum1)
    var sum2 = n1 add 10
    println(sum2)

    // (3)
    "김철수" sayHelloTo "이영희"

    // (4)
    p1.sayHelloTo(p2)
    n1.add(n2)
    n1.add(10)
    "김철수".sayHelloTo("이영희")

    var range1 = 1 until 10
    var range2 = 10 downTo 1
    var range3 = range1 step 2
    var pair = 1 to "Hello"
}
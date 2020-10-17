package classstudy_part2

fun String.removeAllSpace(): String {
    return this.replace(" ", "")
}

fun String.sayHelloTo(to: String, times: Int) {
    for(i in 1 .. times) {
        println("${this}가 ${to}에게 인사합니다.")
    }
}

// (1)
class ExtendedFunctionClass(var x: Int, private var y: String) {
    fun func() {
        println("function inside class")
    }

    private fun privateFunc() {
        println("private function inside class")
    }

    /*
    fun extendedFunction() {
        println("from extended method")
    }
    */
}

fun ExtendedFunctionClass.extendedFunction() {
    println("from extended function")
    // (2) 접근 허용
    func()
    println(x)
    // (3) 접근 불가
    // privateFunc()
    // println(y)
}

fun main(args : Array<String>) {

    var spaceRemoved = " H e l l o ".removeAllSpace()
    println(spaceRemoved)
    "김철수".sayHelloTo("이영희", 2)

    var extended = ExtendedFunctionClass(10, "Hello")
    extended.extendedFunction()
}
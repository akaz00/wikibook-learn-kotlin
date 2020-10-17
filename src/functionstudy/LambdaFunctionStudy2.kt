package functionstudy

fun printAnything(print:(Any) -> Unit, vararg anys: Any) {
    for(a in anys) {
        print(a)
    }
}

fun returnMultiplyFunc(multiplier : Int) : (Int) -> Int {
    return { x -> x * multiplier }
}

// https://discuss.kotlinlang.org/t/function-parameters-are-val-not-var/897/2
fun returnStringPrintFunc(str : String, initial : Int) : () -> String {
    // 메소드로 전달받는 값은 변화 불가능(val)한 값이므로 새로 대입 필요
    var n = initial
    return {
        var result = ""
        for(i in 1 .. n) {
            result += "${str} "
        }
        n++

        result
    }
}

fun calculate(calcFunc:(Int, Int) -> Int, x: Int, y: Int) : Int {
    return calcFunc(x, y)
}

fun multipleLambdaFunc(lambda1: () -> Unit, lambda2: (Int) -> Unit, lambda3: (String, String) -> String) {
    lambda1()
    lambda2(100)
    println(lambda3("Hello", "World"))
}

fun main(args : Array<String>) {
    printAnything({ any: Any -> println(any) }, 1, 2.0, "Hello")

    println("--------------------")
    // (1)
    val multiplyFunc1 = returnMultiplyFunc(3)
    println(multiplyFunc1(2)) // 6 출력
    println(multiplyFunc1(3)) // 9 출력

    // (2)
    val multiplyFunc2 = returnMultiplyFunc(10)
    println(multiplyFunc2(2)) // 20 출력

    println("--------------------")
    val countFunc1 = returnStringPrintFunc("Hello", 1)
    println(countFunc1())
    println(countFunc1())

    val countFunc2 = returnStringPrintFunc("Bye", 3)
    println(countFunc2())
    println(countFunc2())

    println("--------------------")
    val calcResult1 = calculate({ x, y -> x + y }, 2, 3)
    val calcResult2 = calculate({ x, y -> x * y }, 2, 3)
    println(calcResult1)
    println(calcResult2)

    multipleLambdaFunc(
        { println("from lambda 1") },
        { println("from lambda 2 $it") },
        { str1, str2 -> "$str1 $str2" }
    )
}
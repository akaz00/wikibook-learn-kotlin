package functionstudy

fun main(args : Array<String>) {
    /*
    val square : (Int) -> Int = { number: Int -> number * number }
    val printHello : () -> Unit = { println("Hello") }
    val sum : (Int, Int) -> Int = { x : Int, y : Int -> x + y }
    */

    // 함수 타입 추론 가능
    val square = { number: Int -> number * number }
    var printHello = { println("Hello") }
    println(square(4))
    printHello()

    printHello = { println("Bye") }
    printHello()
    // printHello = { number: Int -> number * number }

    val sum = { x : Int, y : Int -> x + y }
    println(sum(2, 5))

    val sayHelloTo : (String) -> Unit = { println("say hello to $it") }
    // it이 아니라 직접 명시한 인자 이름을 통해 접근 가능
    // val sayHelloTo : (String) -> Unit = { s -> println("say hello to $s") }
    sayHelloTo("김철수")
    // val sayHelloTo = { target: String -> println("say hello to $target") }
}


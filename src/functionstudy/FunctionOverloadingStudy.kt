package functionstudy

// square 함수 오버로딩 (전달 인자값의 타입이 다름)
fun square(x: Int) = x * x
fun square(x: Long) = x * x
fun square(x: Float) = x * x
fun square(x: Double) = x * x

// 함수 오버로딩 (전달 인자값의 개수가 다름)
fun overloadingTest() = println("overloading test 1")
fun overloadingTest(x: Int) = println("overloading test 2")
fun overloadingTest(x: Int, y: Int) = println("overloading test 3")

// 전달 인자값의 개수가 같아도 타입이 다르면 오버로딩 가능
fun overloadingTest(x: Int, y: Double) = println("overloading test 4")
fun overloadingTest(x: Double, y: Int) = println("overloading test 5")

fun overloadingTest(x: Int, y: Int, z: Int) : Int = x + y + z
// 반환 타입은 오버로딩에 영향을 미치지 않음 (해당 함수 정의 불가)
// fun overloadingTest(x: Int, y: Int, z: Int) : String = "Hello"

fun main(args : Array<String>) {
    println(square(2))
    println(square(3L))
    println(square(4.0F))
    println(square(5.0))

    overloadingTest()
    overloadingTest(1)
    overloadingTest(2, 3)
    overloadingTest(2, 3.0)
    overloadingTest(2.0, 3)
    println(overloadingTest(1, 2, 3))
}
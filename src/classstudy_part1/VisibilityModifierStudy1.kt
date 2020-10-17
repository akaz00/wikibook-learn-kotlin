package classstudy_part1

// 클래스에 접근 제어자 설정
open class PublicClass
// 주 생성자에 접근 제어자 설정
(var publicProp1 : String, private var privateProp1 : String) {
    // 중괄호 내부에서 속성 정의하며 접근 제어자 설정
    var publicProp2 = "public prop2"
    private var privateProp2 = "public prop2"
    // 클래스를 상속받는 자식 클래스에서는 접근 가능
    protected var protectedProp = "protected"

    // 메소드 정의하며 접근 제어자 설정
    fun publicFunc() {
        // public 접근 제어자가 붙어있으므로 자유롭게 접근 가능
        println(publicProp1)

        // 같은 클래스 내부에서는 private 접근 제어자가 붙은 속성, 메소드를 자유롭게 접근 및 호출 가능
        println(privateProp1)
        privateFunc()

        // protected 접근 제어자가 붙은 속성, 메소드 역시 자유롭게 접근 및 호출 가능
        println(protectedProp)
        protectedFunc()
    }

    private fun privateFunc() = println("from private function")

    // 클래스를 상속받는 자식 클래스에서는 접근 가능
    protected fun protectedFunc() = println("from protected function")
}

//  private 접근 제어자를 붙인 클래스는 같은 파일 내부에서만 사용 가능
private class PrivateClass

// 함수 정의하며 접근 제어자 설정
fun publicFunc() = println("from public function")

// private 접근 제어자를 붙인 함수는 같은 파일 내부에서만 사용 가능
private fun privateFunc() = println("from private function")

// 변수(혹은 상수) 정의하며 접근 제어자 설정
var publicVariable = "public variable"
private val privateConstant = "private constant"

fun main(args : Array<String>) {

    // (1)
    val publicClass = PublicClass("Hello", "World")
    val privateClass = PrivateClass()

    // (2)
    println(publicClass.publicProp1)
    println(publicClass.publicFunc())
    // println(publicClass.protectedFunc())
    // println(publicClass.privateFunc())

    // (3)
    // Cannot access 'privateProp1': it is private in 'PublicClass'
    // println(publicClass.privateProp1)
    // (4)

    publicFunc()
    privateFunc()

    println(publicVariable)
    // (5)
    println(privateConstant)
}
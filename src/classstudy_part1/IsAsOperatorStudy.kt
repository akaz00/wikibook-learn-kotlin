package classstudy_part1

open class A {
    var a = 0
    fun aMethod() = println("A Method")
}
class B : A() {
    var b = 10
    fun bMethod() = println("B Method")
}
class C : A() {
    var c = 20
    fun cMethod() = println("C Method")
}

fun func(value: A) {
    // 함수로 값이 넘어오는 경우 타입 추론이 불가 (따라서 명시적인 캐스팅이 필요)
    var v1: B = value as B // unsafe
    var v2: B? = value as? B // safe

    if(value is B) {
        value.bMethod() // 스마트 캐스트
    }
}

fun main(args : Array<String>) {

    // 객체 생성
    var a = A()
    var b = B()
    var c = C()

    // is 연산자를 이용하여 타입 확인
    // a는 A 클래스 객체
    println(a is A) // A 클래스 객체이므로 당연히 true
    println(a is B) // B 클래스가 A 클래스를 상속받았으나 A 클래스가 B 클래스는 아니므로 false
    println(a is C) // 역시, C 클래스가 A 클래스를 상속받았으나 A 클래스가 C 클래스는 아니므로 false

    // b는 B 클래스 객체
    println(b is A) // B 클래스는 A 클래스를 상속하였으므로 B 클래스임과 동시에 A 클래스이므로 true
    println(b is B) // B 클래스 객체이므로 당연히 true

    // c는 C 클래스 객체
    println(c is A) // C 클래스는 A 클래스를 상속하였으므로 C 클래스임과 동시에 A 클래스이므로 true
    println(c is C) // C 클래스 객체이므로 당연히 true

    // Any는 모든 타입의 조상 타입이므로 결과는 모두 true
    println(a is Any)
    println(b is Any)
    println(c is Any)

    // Shape 인터페이스를 상속받은 Rectangle, Circle 클래스
    var rectangle = Rectangle(10.0, 20.0)
    var circle = Circle(10.0)

    // (1)
    println("rectangle is Shape : ${rectangle is Shape}")
    println("circle is Shape : ${circle is Shape}")

    // !is 연산자는 is 연산자와 반대로 동작 (타입이 같지 않아야 true를 리턴함을 유의!)
    println(a !is Any) // false

    // as 연산자를 이용하여 타입 변환 가능
    var any: Any = a as Any
    // var any: Any = a // 하지만 타입의 관계를 컴파일러에서 추론할 수 있으므로 as 연산자 생략 가능

    // 스마트 캐스트 (Smart cast)
    // (1)
    var strToAny: Any = " Hello "
    // strToAny.trim()

    // (2)
    if(strToAny is String) {
        // (3)
        var s = strToAny as String
        println(s.trim())

        // (4)
        println(strToAny.trim())
    }

    // when 조건문 내부에서도 스마트 캐스트는 잘 동작
    var data: Any = "String"
    // data = 1234

    var result : Any? = when(data) {
        // (1)
        // 문자열 관련 메소드 호출
        is String -> data.toLowerCase()
        // 숫자 관련 메소드 호출
        is Int -> data.inc()
        else -> null
    }
    println(result)

    // as 연산자와 as? 연산자(safe cast)의 차이
    var value: Any = "String"

    // (1)
    var intValue1 = value as Int

    // (2)
    var intValue2 = value as? Int
    println(intValue2)
}
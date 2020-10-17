package classstudy_part1

fun main(args : Array<String>) {

    var b = B()
    var c = C()

    // (1) 업 캐스팅 작업 수행
    var upCasted1WithAsKeyword = b as A // (2)
    var upCasted2WithAsKeyword = c as A // (3)

    // 업 캐스팅의 경우 as 키워드 생략 가능 (단, 변수 옆의 타입에는 캐스팅할 타입 명시 필요)
    var upCasted1: A = b // (4)
    var upCasted2: A = c // (5)

    println(upCasted1.a)
    upCasted1.aMethod()
    // (6) 비록 원래 클래스는 B 클래스였어도 현재는 A 클래스 타입의 변수에 담겨있으므로 B 클래스에 정의된 속성(b) 접근 및 메소드(bFunc)는 호출 불가
    // println(upCasted1.b)
    // upCasted1.bFunc()

    upCasted2.aMethod()
    // println(upCasted2.c)
    // upCasted2.cFunc()

    // 다운 캐스팅
    var downCasted1 = upCasted1 as B
    var downCasted2 = upCasted2 as C

    // 다운 캐스팅 이후 해당 클래스 고유의 속성 및 메소드 접근 가능
    println(downCasted1.b)
    downCasted1.bMethod()

    println(downCasted2.c)
    downCasted2.cMethod()

    // Phone 추상 클래스를 상속받는 클래스 객체 생성
    var galaxyPhone = GalaxyS()
    var v30Phone = V30()

    // 추상 클래스 타입으로 업 캐스팅
    var phone1 : Phone = galaxyPhone
    var phone2 : Phone = v30Phone

    // 실제로 실행되는 메소드는 각자 재정의된 메소드
    phone1.turnOn()
    phone2.turnOn()

    // Shape 인터페이스를 구현한 클래스 객체 생성
    var rectangle = Rectangle(10.0, 20.0)
    var circle = Circle(10.0)

    // 인터페이스 타입으로 업 캐스팅
    var shape1 : Shape = rectangle
    var shape2 : Shape = circle

    // 실제로 실행되는 메소드는 각자 재정의된 메소드
    println(shape1.calculateArea())
    println(shape1.calculatePerimeter())

    println(shape2.calculateArea())
    println(shape2.calculatePerimeter())
}
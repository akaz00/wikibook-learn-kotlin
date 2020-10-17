package classstudy_part1

// 주 생성자가 없는 클래스
class MyClass {
    // 보조 생성자를 정의 (주 생성자가 없으므로 this를 이용한 주 생성자 호출 불필요)
    constructor() {
        println("from constructor")
    }

    // 보조 생성자를 정의 (this()는 앞에서 정의한 from constructor를 출력하는 보조 생성자를 호출)
    constructor(arg: Int) : this() {
        println("from constructor with arg($arg)")
    }
}

// (인자값이나 전달값이 없지만) 주 생성자가 분명히 존재
class MyClassWithPrimaryConstructor() {
    // 보조 생성자를 정의 (주 생성자가 존재하므로 반드시 호출 필요)
    constructor(arg: Int) : this() {
        println("from constructor with arg($arg)")
    }

    // 보조 생성자를 정의 (주 생성자를 호출하는 보조 생성자를 호출하므로 잘 작동)
    constructor(arg1: Int, arg2: Int) : this(arg1) {}
}

fun main(args : Array<String>) {

    var a = MyClass()
    var b = MyClass(100)
    var c = MyClassWithPrimaryConstructor()
    var d = MyClassWithPrimaryConstructor(100)
}
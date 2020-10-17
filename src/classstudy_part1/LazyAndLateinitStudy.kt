package classstudy_part1

import java.util.*

class PropertyObject {
    fun func() {
        println("from PropertyObject Function")
    }
}

class LazyClass(var x: Int) {
    // (1)
    val lazyValue1 by lazy {
        // (2)
        println("lazy 람다 식 내부에서 속성값 초기화 진행")
        var s = " HELLO "
        s.toLowerCase().trim()
    }

    // (3)
    val lazyValue2 by lazy {
        x * 2
    }

    // (4)
    val costHeavyProperty by lazy {
        println("시간이 오래 걸리고 메모리 사용량이 많은 속성값 초기화 진행")
        Thread.sleep(1000)
        Array<Byte>(1024 * 1024 * 100){0}
    }
}


class LateInitClass {
    // lateinit은 primitive 타입을 지원하지 않음
    // (1) lateinit var a: Int // 'lateinit' modifier is not allowed on primitive type properties
    // 오직 클래스 타입만 지원
    lateinit var obj: PropertyObject

    fun initMyObject(value: PropertyObject) {
        // (2) 값을 초기화
        obj = value
    }

    fun useMyObject() {
        // (3) 늦게 초기화 되는 속성값에 접근 (만약 이 시점에 초기화되지 않았다면 UninitializedPropertyAccessException 예외 발생)
        obj.func()
    }
}

fun main(args : Array<String>) {

    var lazyClass = LazyClass(10)

    // (5)
    // 처음으로 속성에 접근하는 순간 람다식 내부의 명령어가 실행되어 속성값이 초기화됨
    println(lazyClass.lazyValue1)

    // (6)
    // 이후 속성에 여러 번 접근해도 람다식이 실행되지 않음(이미 기존에 초기화된 값에 접근)
    println(lazyClass.lazyValue1)
    println(lazyClass.lazyValue1)

    println(lazyClass.lazyValue2)

    // (7)
    //조건부로 실행되는 코드(따라서 해당 조건을 만족해서 실제로 접근할 때 값을 초기화하는 것이 더 합리적)
    if(Random().nextBoolean()) {
        println(lazyClass.costHeavyProperty)
    }

    println("--------------------")
    var lateInitClass = LateInitClass()
    // lateInitClass.useMyObject() // 적절한 초기화 과정 없이 호출할 경우 에러 발생 (UninitializedPropertyAccessException: lateinit property a has not been initialized)

    lateInitClass.initMyObject(PropertyObject()) // 초기화 수행
    lateInitClass.useMyObject() // 이제 안전하게 이용 가능
}
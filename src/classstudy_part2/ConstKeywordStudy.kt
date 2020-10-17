package classstudy_part2

class ConstDemo {
    companion object {
        // (1)
        // 세 상수 선언
        val CONSTANT_VAL1 = "constant value 1"
        const val CONSTANT_VAL2 = "constant value 2"
        @JvmField val CONSTANT_VAL3 = "constant value 3"

        // (2)
        val CONSTANT_PERSON1 = Person("김철수1", 10)
        @JvmField val CONSTANT_PERSON2 = Person("김철수2", 20)
        // const val 로 정의한 상수의 경우 기본 타입과 문자열만 대입 허용
        // const val CONSTANT_PERSON = Person("김철수", 20)
    }
}

fun main(args : Array<String>) {

    println(ConstDemo.CONSTANT_VAL1)
    println(ConstDemo.CONSTANT_VAL2)
    println(ConstDemo.CONSTANT_VAL3)

    println(ConstDemo.CONSTANT_PERSON1)
    println(ConstDemo.CONSTANT_PERSON2)
}

/*
// https://blog.egorand.me/where-do-i-put-my-constants-in-kotlin/
// https://stackoverflow.com/questions/45628861/kotlin-why-the-compiler-needs-the-const-modifier
// https://medium.com/@BladeCoder/exploring-kotlins-hidden-costs-part-1-fbb9935d9b62
// https://www.baeldung.com/kotlin-jvm-field-annotation

class ConstDemo {
    // Const 'val' are only allowed on top level or in objects
    // const val constVal1 = "Hello"

    companion object {
        // https://stackoverflow.com/questions/49426456/kotlin-whats-the-reasoning-behind-const
        // 내부적으로는 게터 메소드를 통해 호출 (호출에 따르는 오버헤드 존재)
        val CONSTANT_VAL1 = "Constant 1"
        // 인라인되어 해당 상수로 치환 처리됨을 주의
        const val CONSTANT_VAL2 = "Constant 2"
        // @JvmField를 붙여서 ConstDemo 클래스에 정의된 static final 상수로 인식하도록 설정
        @JvmField val CONSTANT_VAL3 = "Constant 3"

        // const val 로 정의한 상수의 경우 기본 타입과 문자열만 대입 허용
        // Const 'val' has type 'Person'. Only primitives and String are allowed 에러 발생
        // const val COSNTANT_PERSON = Person("김철수", 20)
        @JvmField val COSNTANT_PERSON = Person("김철수", 20)

        // 컴파일 시점에 값이 정해져야 하므로 런타임에 실행되는 함수(혹은 메소드) 호출 반환값을 이용한 초기화는 불가
        // Const 'val' initializer should be a constant value 에러 발생
        // const val CONSTANT_VAL4 = getNum()
    }
}


fun main(args : Array<String>) {
    println(ConstDemo.CONSTANT_VAL1)
    println(ConstDemo.CONSTANT_VAL2)
    println(ConstDemo.CONSTANT_VAL3)
    println(ConstDemo.COSNTANT_PERSON)

    val demo = JvmFieldAnnotationDemo()
    println(demo.value1)
    println(demo.value2)
    println(demo.value3)
}
*/
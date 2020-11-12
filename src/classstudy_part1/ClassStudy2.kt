package classstudy_part1

// 클래스 정의
class Person1 {
    // 적절한 초깃값을 대입
    var name : String = "무명씨"
    var age : Int = 0
}

class Person2(val name: String, var age: Int, val gender: String) {}

// val, var 키워드가 생략됨(따라서 클래스의 속성이 정의되지 않음)
class Person3(name: String, age: Int, gender: String) {}

class Person4(val gender: String, val name: String = "무명씨", var age: Int = 20) {}

fun main(args : Array<String>) {
    var p1 = Person1()
    // 사람 객체의 이름 속성값 출력
    println(p1.name)
    // 사람 객체의 나이 속성값 출력
    println(p1.age)

    p1.name = "김철수"
    p1.age = 20

    // 변경된 속성값 확인
    println(p1.name)
    println(p1.age)

    // (3) 변경된 속성값 확인
    println(p1.name) // 김철수
    println(p1.age) // 20

    println("--------------------")
    // 객체를 생성하면서 초깃값을 바로 전달
    var p2 = Person2("김철수", 20, "남성")
    println(p2.name)
    println(p2.age)
    println(p2.gender)

    println("--------------------")
    var p3 = Person3("김철수", 20, "남성")
    // Unresolved reference: name 에러 발생 (name 속성이 존재하지 않음)
    // println(p3.name)
    // 마찬가지의 이유로 실행 불가
    // println(p3.age
    // println(p3.gender)

    println("--------------------")
    var p4 = Person4("남성")
    println("${p4.name} ${p4.age}")

    p4 = Person4("여성", "이영희", 15)
    println("${p4.name} ${p4.age}")

    // 생성 불가
    // p4 = Person4("남성", 30)

    p4 = Person4("남성", age=30)
    println("${p4.name} ${p4.age}")
}

package classstudy_part1

class Spy1(var realName: String, var realAge: Int, var realGender: String) {
    var fakeName: String
    var fakeAge: Int
    var fakeGender: String

    // 주 생성자에는 코드를 작성할 수 없으므로 주 생성자 호출 이후 바로 호출되는 init 블록 내부에 전달받은 진짜 이름, 나이, 성별 정보를 이용한 가짜 정보 생성 코드 작성
    init {
        // 이름을 거꾸로 바꾸어 저장
        fakeName = realName.reversed()
        fakeAge = realAge * 2
        fakeGender = if(realGender == "남성") "여성" else "남성"
    }
}

// 주 생성자의 var 키워드 생략하여 진짜 이름, 나이, 성별을 저장할 속성이 생성되지 않도록 수정
class Spy2(realName: String, realAge: Int, realGender: String) {
    var fakeName: String
    var fakeAge: Int
    var fakeGender: String

    init {
        fakeName = realName.reversed()
        fakeAge = realAge * 2
        fakeGender = if(realGender == "남성") "여성" else "남성"
    }
}

class Spy3(realName: String, realAge: Int, realGender: String) {
    // 속성값 초기화 작업에 간단한 한 줄의 코드만 필요하다면 init 블록을 사용하지 않고 바로 대입도 가능
    var fakeName = realName.reversed()
    var fakeAge = realAge * 2
    var fakeGender = if(realGender == "남성") "여성" else "남성"
}

fun main(args : Array<String>) {

    println("--------------------")
    var spy1 = Spy1("김철수", 20, "남성")
    var spy2 = Spy2("이영희", 30, "여성")
    println("${spy1.fakeName}, ${spy1.fakeAge}, ${spy1.fakeGender}")
    println("${spy2.fakeName}, ${spy2.fakeAge}, ${spy2.fakeGender}")
}

package classstudy_part1

class Extender(prop1 : String, prop2 : String) : PublicClass(prop1, prop2) {
    fun parentAccessDemo() {
        // (1)
        // 상속을 받고 있는 클래스이므로 protected 접근 제어자가 붙은 속성 및 메소드에는 접근 가능
        println(protectedProp)
        protectedFunc()

        // (2)
        // 상속 관계에 있다고 하더라도 private 접근 제어자가 붙은 속성 및 메소드에는 해당 클래스 내부에서만 접근 가능
        // println(privateProp1)
        // privateFunc()
    }
}

fun main(args : Array<String>) {

    // Cannot access 'PrivateClass': it is private in file 에러 출력
    // 같은 파일에 정의된 클래스가 아니므로 접근 불가
    // val privateClass = PrivateClass()

    publicFunc()
    // Cannot access 'privateFunc': it is private in file 에러 출력
    // 같은 파일에 정의된 함수가 아니므로 접근 불가
    // privateFunc()

    println(publicVariable)
    // Cannot access 'privateConstant': it is private in file 에러 출력
    // 같은 파일에 정의된 변수(혹은 상수)가 아니므로 접근 불가
    // println(privateConstant)
}
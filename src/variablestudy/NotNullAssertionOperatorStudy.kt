package variablestudy

fun main(args : Array<String>) {
    var nullableStr: String? = null

    // nullableStr 변수의 값이 null이므로 !! 연산자를 이용해 타입을 String?에서 String으로 변환하는 과정에서 오류가 발생
    // var str: String = nullableStr!!

    // nullableStr2 변수에 유효한 값 대입
    var nullableStr2: String? = "Hello"

    var str: String = nullableStr2!!
    // 변환 이후 타입은 String이므로 속성에 별도의 연산자를 사용하지 않고도 접근 가능
    println(str.length)
}
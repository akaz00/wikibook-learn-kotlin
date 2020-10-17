package variablestudy

fun main(args : Array<String>) {
    // ("저장할 타입의 이름" ArrayOf로 명명된) intArrayOf 함수를 호출해 원시 타입(int) 배열 생성
    var intArr = intArrayOf(1, 2, 3)
    // 자바 언어에 대응하는 타입을 확인하기 위해서 canonicalName 속성에 접근
    println(intArr.javaClass.canonicalName)
    // charArrayOf 함수를 호출해 원시 타입(char) 배열 생성
    var charArr = charArrayOf('a', 'b', 'c')
    println(charArr.javaClass.canonicalName)

    // 래퍼 타입 배열을 생성
    var intWrapperArr = arrayOf(1, 2, 3)
    var charWrapperArr = arrayOf('a', 'b', 'c')

    // 변환할 배열에 저장할 값의 타입이 Int이므로 toIntArray를 호출해서 원시 타입 객체를 저장하는 배열로 변환
    var intPrimitiveArr = intWrapperArr.toIntArray()
    // 변환할 배열에 저장할 값의 타입이 Char이므로 toCharArray를 호출해서 원시 타입 객체를 저장하는 배열로 변환
    var charPrimitiveArr = charWrapperArr.toCharArray()
}
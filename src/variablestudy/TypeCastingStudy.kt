package variablestudy

fun main(args : Array<String>) {
    /* 타입 변환 */
    // 타입을 변환할 변수 선언
    var byteValue: Byte = 65
    println(byteValue)
    // Int, Short, Long, Float, Double 타입으로 각각 변환하는 메서드를 호출
    var intValue:Int = byteValue.toInt()
    println(intValue)
    var shortValue:Short = byteValue.toShort()
    println(shortValue)
    var longValue:Long = byteValue.toLong()
    println(longValue)
    var floatValue:Float = byteValue.toFloat()
    println(floatValue)
    var doubleValue:Double = byteValue.toDouble()
    println(doubleValue)
    // Char 타입으로 변환. 65는 문자 'A'에 대응되는 숫자이므로 charValue 변수에는 'A' 문자가 저장됨
    var charValue:Char = byteValue.toChar()
    // A 출력
    println(charValue)

    // 비정상적으로 작동하는 변환 사례
    // Short 타입의 최대값인 32767 대입
    var maxShortNum: Short = 32767
    // Byte값으로 변환 (Byte 타입의 최대값은 255)
    var shortToByte: Byte = maxShortNum.toByte()
    println(shortToByte)

    // 정상적으로 작동하는 변환 사례
    var shortNum: Short = 127
    // 127은 Byte 범위내에서 저장할 수 있는 값이므로 아무 이상없이 변환 가능
    var shortToByteSafe: Byte = shortNum.toByte()

    println(shortToByteSafe)

    // 항상 정상적으로 작동하는 변환 사례
    var maxIntNum: Int = 2147483647
    var intToLong: Long = maxIntNum.toLong()

    println(intToLong)

    /* 문자열 변환 */
    var intString = "1234"
    var doubleString = "1.234"

    var stringToInt = intString.toInt()
    var stringToDouble = doubleString.toDouble()

    println(stringToInt)
    println(stringToDouble)

    var booleanString = "true"
    var stringToBoolean = booleanString.toBoolean()
    println(stringToBoolean)

    var num = 1234
    // 숫자 1234를 문자열 "1234"로 변환
    var intToString: String = num.toString()
    println(intToString)

    var wrongNumberString = "숫자아님"
    var wrong = wrongNumberString.toInt()
    var wrong2: Int? = wrongNumberString.toIntOrNull() // 숫자로 변환하거나 실패할 경우 null을 반환 (타입이 Int?임을 주목)
    println(wrong2) // null 출력
}
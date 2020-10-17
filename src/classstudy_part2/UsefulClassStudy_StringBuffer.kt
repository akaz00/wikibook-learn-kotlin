package classstudy_part2

fun main(args : Array<String>) {
    // StringBuffer
    // val sb = StringBuffer()
    // capacity 설정 가능
    val sb = StringBuffer(1024)

    // 내용 추가
    sb.append("Hello")
    sb.append(" World")
    println(sb)

    // 특정 위치에 내용 삽입
    sb.insert(0, "Kotlin ")
    println(sb)

    // 특정 범위에 포함된 내용 삭제
    sb.delete(0, 7)
    println(sb)

    println(sb.length)

    // 문자열로 변환
    val bufferToStr = sb.toString()
}

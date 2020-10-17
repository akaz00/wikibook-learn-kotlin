package classstudy_part2

fun main(args : Array<String>) {
    /* 문자열 */
    var str1 = "Hello"

    // length 속성 : 문자열 길이 반환
    println(str1.length)

    // 인덱스 연산자 (내부적으로 charAt 메소드 호출)
    println(str1[0])

    // indexOf : 특정 글자 혹은 문자열이 포함된 시작 위치 반환
    val idx1 = str1.indexOf('H')
    val idx2 = str1.indexOf('l')
    val idx3 = str1.indexOf('a')
    val idx4 = str1.indexOf("el")

    println(idx1) // 0
    println(idx2) // 2
    println(idx3) // -1
    println(idx4) // 1

    // contains : 특정 글자 혹은 문자열이 포함되어 있는지 여부 반환
    println(str1.contains('a')) // false
    println(str1.contains("el")) // true

    // startsWith, endsWith : 접두어, 접미어 확인
    println(str1.startsWith("He")) // true
    println(str1.endsWith("lo")) // true

    // replace : 문자열의 일부를 치환
    var replaced = str1.replace("He", "Je")
    println(replaced)

    // substring : 문자열의 일부만 추출
    var sub = str1.substring(0..3)
    println(sub)

    // split : 특정 문자를 기준으로 문자를 나누기
    var splitted : List<String> = "Hello,World,Kotlin".split(",")
    for(s in splitted) {
        println(s)
    }
    // joinToString : 배열 혹은 리스트에 포함된 문자열 사용하여 특정 구분자(delimiter)를 이용하여 합쳐주기
    var joined = listOf("Hello", "World", "Kotlin").joinToString(",")
    println(joined)

    // 공백 제거 메소드
    val target1 = " \t\nHello\n\t "
    val result1 = target1.trim()
    val result2 = target1.trimStart()
    val result3 = target1.trimEnd()

    println("${result1.length}") // 5
    println("${result2.length}") // 8
    println("${result3.length}") // 8

    // 중간에 있는 공백은 replace로 제거
    val spaceRemoved = "H e l l o".replace(" ", "")
    println("${spaceRemoved}") // "Hello"

    // 비어있는, 내용 없는 문자열 관련 메소드
    // isEmpty, ifEmpty : 내용이 비어있으면 참 반환, 내용이 비어있으면 로직 실행
    // isBlank, ifBlank :
    val empty = ""
    println(empty.isEmpty()) // true
    println(empty.isBlank()) // true

    val blank = " \t\n"
    println(blank.isEmpty()) // false
    println(blank.isBlank()) // true
    blank.ifEmpty { println("비어있는 문자열입니다.") }
    blank.ifBlank { println("내용이 없는 문자열입니다.") }

    // trimMargin
    var text = """Hello
        |Kotlin
        |Language
    """.trimMargin()
    println(text)

    var textWithSharp = """Hello
        #Kotlin
        #Language
    """.trimMargin("#")
    println(textWithSharp)

    var textWithLines = "first\nsecond\nthird\n"

    val lines = textWithLines.lines()
    for(line in lines) {
        println(line)
    }

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

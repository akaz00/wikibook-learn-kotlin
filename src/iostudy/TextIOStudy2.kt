package iostudy

import java.io.File

fun main(args : Array<String>) {
    val f2 = File("file2.txt")
    // exists 메소드로 파일의 존재 여부 파악 가능
    if(f2.exists()) {
        println("파일의 readText 메소드 활용")
        // 전체 파일(텍스트)의 내용 읽어오기
        var fileText = f2.readText()
        println(fileText)

        println("파일의 forEachLine 메소드 활용")
        // 개행 문자를 기준으로 줄 별로 읽어오기
        var lineNum = 1
        f2.forEachLine {
            println("line $lineNum : $it")
            lineNum++
        }

        println("readLines 메소드 활용")
        // readLines 메소드 : 각 줄 내용을 List 형태로 받아옴
        lineNum = 1
        var lines : List<String> = f2.readLines()
        lines.forEach {
            println("line $lineNum : $it")
            lineNum++
        }
    } else {
        println("${f2.name} 파일이 존재하지 않습니다.")
    }
}
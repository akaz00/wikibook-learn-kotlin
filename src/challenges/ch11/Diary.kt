package challenges.ch11

import java.io.File
import java.time.LocalDateTime

fun main(args : Array<String>) {
    // Q1) 임의의 파일을 열고 내용을 키보드로 입력받아 파일에 쓰도록하는 프로그램 작성 (/quit을 입력할 경우 프로그램 종료)
    // Q2) /clear를 입력할 경우 해당 내용을 모두 지우도록 명령어 추가
    val today = LocalDateTime.now()
    val year = today.year
    val month = today.month.value
    val day = today.dayOfMonth

    var diaryFile = File("diary_$year-$month-$day.txt")
    diaryFile.createNewFile()
    while(true) {
        print("> ")
        val line = readLine()

        if(line == "/quit") break
        if(line == "/clear") {
            diaryFile.writeText("")
        } else {
            diaryFile.appendText("${line!!}\n")
            println("\"$line\" 입력 완료.")
        }
    }
}
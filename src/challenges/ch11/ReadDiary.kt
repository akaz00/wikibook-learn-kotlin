package challenges.ch11

import java.io.*
import java.time.LocalDateTime

fun main(args : Array<String>) {
    val today = LocalDateTime.now()
    val year = today.year
    val month = today.month.value
    val day = today.dayOfMonth

    var diaryFile = File("diary_$year-$month-$day.txt")
    if(diaryFile.exists()) {
        val content = diaryFile.readText()
        println(content)
    }
}
package challenges.ch11

import java.io.*
import java.time.LocalDateTime

fun main(args : Array<String>) {
    val today = LocalDateTime.now()
    val year = today.year
    val month = today.month.value
    val day = today.dayOfMonth

    var diaryFile = File("diary_$year-$month-$day.bin")
    if(diaryFile.exists()) {
        val ois = ObjectInputStream(FileInputStream(diaryFile))
        val diary = ois.readObject() as Diary
        ois.close()
        println(diary.content)
    }
}
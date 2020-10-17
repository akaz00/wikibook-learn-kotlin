package challenges.ch11

import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.Serializable
import java.time.LocalDateTime

data class Diary(var content: String) : Serializable

fun main(args : Array<String>) {
    val today = LocalDateTime.now()
    val year = today.year
    val month = today.month.value
    val day = today.dayOfMonth

    var content = ""
    var diaryFile = File("diary_$year-$month-$day.bin")
    diaryFile.createNewFile()
    while(true) {
        print("> ")
        val line = readLine()

        if(line == "/quit") {
            val diary = Diary(content)
            val oos = ObjectOutputStream(FileOutputStream(diaryFile))
            oos.writeObject(diary)
            oos.flush()
            oos.close()
            break
        }
        if(line == "/clear") {
            content = ""
        } else {
            content += "$line\n"
            println("\"$line\" 입력 완료.")
        }
    }
}
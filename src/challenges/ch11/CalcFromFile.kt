package challenges.ch11

import java.io.File

fun main(args : Array<String>) {
    val calcFile = File("calc.txt")

    if(calcFile.exists()) {
        val lines = calcFile.readLines()
        if(lines.size > 2) {
            val op = lines[0].trim()
            val result = when(op) {
                "+" -> lines[1].toDouble() + lines[2].toDouble()
                "-" -> lines[1].toDouble() - lines[2].toDouble()
                "*" -> lines[1].toDouble() * lines[2].toDouble()
                "/" -> lines[1].toDouble() / lines[2].toDouble()
                else -> null
            }
            println(result)
        } else {
            println("파일 데이터 형식에 문제가 있습니다.")
        }
    }
}

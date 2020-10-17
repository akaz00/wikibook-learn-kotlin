package classstudy_part2

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.system.exitProcess

fun main(args : Array<String>) {

    /* 시스템 */
    // Epoch 시간 (Long 타입으로 구하기)
    val millis = System.currentTimeMillis()
    println(millis)

    //
    val dateTimeFromMillis = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.of("Asia/Seoul"))
    println(dateTimeFromMillis)

    println("System properties")
    val props = System.getProperties()
    for(prop in props) {
        println("key : ${prop.key}\nvalue : ${prop.value}\n")
    }

    println(System.getProperty("os.name"))

    println("System environments")
    val envs = System.getenv()
    for(env in envs) {
        println("key : ${env.key}\nvalue : ${env.value}\n")
    }

    // 프로세스 종료 (내부적으로 System.exit(0) 호출)
    exitProcess(0)
}

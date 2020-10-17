package classstudy_part2

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.TimeZone

fun main(args : Array<String>) {

    /* 날짜 */
    // LocalDate는 날짜 정보만 필요할 때 사용
    var now: LocalDate = LocalDate.now()
    println(now)
    // 년, 월, 일 정보에 접근
    println(now.year)
    println(now.month)
    println(now.dayOfMonth)

    // LocalDateTime는 날짜와 시간 정보가 동시에 필요할 때 사용
    var nowWithTime = LocalDateTime.now()
    // 시, 분, 초 정보에도 접근 가능
    println(nowWithTime.hour)
    println(nowWithTime.minute)
    println(nowWithTime.second)

    // 기본 시간대 확인
    println(TimeZone.getDefault().toZoneId())
    // 협정 세계표준시(UTC)를 시간대로 사용하여 객체 반환
    var nowInUTC = LocalDateTime.now(ZoneId.of("UTC"))
    // 한국 시간에서 9시간 전의 시간 출력
    println("nowUTC : ${nowInUTC}")

    var date = LocalDate.parse("2019-01-01")
    println(date)
    var dateTime = LocalDateTime.parse("2019-01-01T13:14:15")
    println(dateTime)

    // 날짜 포맷팅
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    // 반환하는 것은 문자열
    val formatted : String = nowWithTime.format(formatter)
    println(formatted)

    var dateTime2 = LocalDateTime.parse("2019-01-01 13:14:15", formatter)
    println(dateTime2)
}

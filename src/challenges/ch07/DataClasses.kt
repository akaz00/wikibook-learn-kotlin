package challenges.ch07

import java.time.LocalDateTime

data class Movie(val title: String, var genre: String, var rating: Double)

data class TwitterMessage(
    var userName: String,
    var userId: String,
    var createdAt: LocalDateTime,
    var content: String,
    var retweeted: Int,
    var liked: Int)

fun main(args : Array<String>) {
    val movie = Movie("겨울왕국", "Animation", 9.0)
    println(movie)

    val msg = TwitterMessage(
        "프로그래밍 책 인용 봇",
        "book_quote_bot",
        LocalDateTime.of(2020, 5, 28, 20, 5, 0),
        "우리가 단지 돌을 자를지라도 언제나 대성당을 마음속에 그려야 한다. - 채석장 일꾼의 신조 {실용주의 프로그래머}",
        1, 2)
    println(msg)
}
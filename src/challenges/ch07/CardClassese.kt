package challenges.ch07

import java.lang.Exception

enum class CardSuit {
    SPADE, DIAMOND, HEART, CLUB
}

class Card(val suit: CardSuit, val num: Int) {
    override fun toString(): String {
        var numToStr = when(num) {
            1 -> "ACE"
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> num.toString()
        }

        return "${suit.toString()} ${numToStr}"
    }
}

class InvalidCardNumber(message:String="잘못된 카드 숫자입니다.(카드 숫자의 범위는 1이상 13이하)") : Exception(message)

class CardWithException(val suit: CardSuit, var num: Int) {
    init {
        // 범위 안에 포함되지 않았을 경우 예외 발생
        if(num !in 1 .. 13) {
            throw InvalidCardNumber()
        }
    }
}

fun main(args : Array<String>) {
    //
    var spade = CardSuit.SPADE
    var diamond = CardSuit.DIAMOND
    var heart = CardSuit.HEART
    var club = CardSuit.CLUB

    //
    var card1 = Card(CardSuit.SPADE, 1)
    var card2 = Card(CardSuit.DIAMOND, 2)
    var card3 = Card(CardSuit.HEART, 3)
    var card4 = Card(CardSuit.CLUB, 4)
    var card11 = Card(CardSuit.DIAMOND, 11)
    var card12 = Card(CardSuit.HEART, 12)
    var card13 = Card(CardSuit.CLUB, 13)

    println(card2)
    println(card3)
    println(card4)
    println(card1)
    println(card11)
    println(card12)
    println(card13)

    //
    var invalid = CardWithException(CardSuit.SPADE, 100)
}
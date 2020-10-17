package collectionstudy

fun main(args : Array<String>) {
    //
    var evens = listOf(2, 4, 6, 8, 10)
    var odds = listOf(1, 3, 5, 7, 9)
    // (재사용을 위해서) 미리 람다 함수를 상수로 선언
    val isEven = { n : Int -> (n % 2) == 0 }

    // var result1 = evens.any { (it % 2) == 0 }
    var result1 = evens.any(isEven)
    var result2 = evens.all(isEven)
    var result3 = evens.none(isEven)

    var result4 = odds.any(isEven)
    var result5 = odds.all(isEven)
    var result6 = odds.none(isEven)

    println("$result1 $result2 $result3")
    println("$result4 $result5 $result6")
}
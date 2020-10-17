package collectionstudy

import kotlin.math.floor

fun main(args : Array<String>) {
    var accountList = listOf(
        Account("chulsoo", Person("김철수", "남성", 25)),
        Account("hee0", Person("이영희", "여성", 30)),
        Account("ho_park", Person("박철호", "남성", 35)),
        Account("suyong1004", Person("윤수영", "여성", 28)),
        Account("khana", Person("김하나", "여성", 18))
    )

    var productList = listOf(
        Product("라면", 500.0, 0.3),
        Product("빵", 800.0, 0.0),
        Product("음료수", 1300.0, 0.1),
        Product("고급 음료수", 1900.0, 0.2),
        Product("계란", 3500.0, 0.0)
    )

    // group by
    var grouped = productList.groupBy {
        floor(it.price / 1000)
    }
    println(grouped)

    // associate, associateBy
    var mapByIdKey = accountList.associate { it.id to it.person }
    println(mapByIdKey)
    var mapByGenderKey = accountList.associate { it.person.gender to it.person }
    println(mapByGenderKey)

    // distinct
    var distinct1 = listOf(1, 2, 1, 2, 3, 3).distinct()
    var distinct2 = listOf('a', 'b', 'c', 'a', 'b', 'c').distinct()
    println(distinct1)
    println(distinct2)

    // min, max, sum, average, count
    var nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("min : ${nums.min()}")
    println("max : ${nums.max()}")
    println("sum : ${nums.sum()}")
    println("average : ${nums.average()}")
    println("count : ${nums.count()}")
}
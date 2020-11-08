package collectionstudy

import kotlin.math.floor

data class Person(var name: String, var gender: String, var age: Int)
data class Account(val id: String, var person: Person)
data class Product(var name: String, var price: Double, var discountRate: Double)

fun<T> Iterable<T>.average(f: (T) -> Any): Double {
    var sum = 0.0
    var count = 0
    for(e in this) {
        sum += f(e).toString().toDouble()
        count++
    }
    return sum / count
}

fun main(args : Array<String>) {
    var personList = listOf(
        Person("김철수", "남성", 25),
        Person("이영희", "여성", 30),
        Person("박철호", "남성", 35),
        Person("윤수영", "여성", 28),
        Person("김하나", "여성", 18)
    )

    var productList = listOf(
        Product("라면", 500.0, 0.3),
        Product("빵", 800.0, 0.0),
        Product("음료수", 1300.0, 0.1),
        Product("고급 음료수", 1900.0, 0.2),
        Product("계란", 3500.0, 0.0)
    )

    personList.forEach { println(it.name) }
    productList.forEachIndexed {
        idx, product ->
        println("$idx : $product")
    }

    // map
    var discountProducts = productList.map { it.name }
    println(discountProducts)
    var discountPrices = productList.map { it.price - (it.discountRate * it.price) }
    println(discountPrices)
    var discountProductNameAndPrices = productList.map { Pair(it.name, it.price - (it.discountRate * it.price)) }
    println(discountProductNameAndPrices)
    var keys = mapOf("key1" to 1, "key2" to 2).map { it.key }
    println(keys)

    // filter
    var filtered1 = personList.filter {
        it.age in 20 .. 29
    }
    println(filtered1)
    var filtered2 = personList.filter {
        it.name.startsWith("김")
    }
    println(filtered2)
    var filtered3 = personList.filter {
        it.gender == "여성"
    }
    println(filtered3)
    var noDiscountProducts = productList.filter {
        it.discountRate == 0.0
    }
    println(noDiscountProducts)

    var oneToTen = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // partition
    var partitioned = oneToTen.partition { (it % 2) == 0 }
    println("partitioned.first : ${partitioned.first}")
    println("partitioned.second : ${partitioned.second}")

    // reduce
    // reduce 함수를 이용하여 sum 함수 흉내내기
    var reduced1 = oneToTen.reduce {
        acc, num ->
        // (1)
        println("acc : $acc, num: $num")
        // (2)
        acc + num
    }
    println("reduced1 : $reduced1")

    // reduce 함수를 이용하여 joinToString 함수 흉내내기
    var strings = listOf("Hello", "World", "Kotlin")
    var reduced2 = strings.reduce { acc, str -> "$acc,$str" }
    println("reduced2 : $reduced2")
    println("${strings.joinToString(",")}")

    var reduced3 = strings.reduceRight { str, acc -> "$acc,$str" }
    println("reduced3 : $reduced3")

    // count
    var personAgeOver30 = personList.count { it.age >= 30 }
    println("personAgeOver30 : $personAgeOver30")

    // zip
    var discountProductsWithPrice = discountProducts.zip(discountPrices)
    println(discountProductsWithPrice)

    var discountProductsWithPrice2 = discountProducts.zip(discountPrices) {
        prod, price ->
        mapOf("name" to prod, "price" to price)
    }
    println(discountProductsWithPrice2)

    // 도전과제
    println(personList.average { it.age })
    println(productList.average { it.price })
}
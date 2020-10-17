package classstudy_part2

import kotlin.random.Random

import kotlin.math.*

fun main(args : Array<String>) {

    /* 난수 */
    // 정수 범위 난수 생성
    val randomInt = Random.nextInt()
    // 0.0부터 1.0을 제외한 실수 범위의 난수 생성 (0.0 ~ 0.999...)
    val randomDouble = Random.nextDouble()
    // 참 혹은 거짓 반환
    val randomBoolean = Random.nextBoolean()

    println(randomInt)
    println(randomDouble)
    println(randomBoolean)

    // 범위를 이용하여 정수 난수 생성
    val randomBetweenZeroToHundred = Random.nextInt(101)
    val randomDiceNum = Random.nextInt(1, 7)

    // 시드를 이용한 랜덤 객체 생성
    val seed = 0
    val randomFromSeed1 = Random(seed)
    val randomFromSeed2 = Random(seed)

    // 같은 시드로 만들고 같은 순서로 랜덤값을 출력할 경우 항상 같은 결과를 냄
    for(i in 1..1000) {
        if(randomFromSeed1.nextInt() != randomFromSeed2.nextInt()) {
            println("서로 다른 난수가 생성됨")
        }
    }
}

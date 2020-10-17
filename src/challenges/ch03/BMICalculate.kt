package challenges.ch03

fun main(args : Array<String>) {
    var height = 1.8
    var weight = 80.0

    // BMI : 몸무게(단위는 KG) / 키(단위는 미터)의 제곱
    val BMI = weight / (height * height)
    println(BMI)
}
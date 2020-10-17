package controlstudy

fun main(args : Array<String>) {
    // (1)
    if(true) {
        println("true")
    }

    // (2)
    if(100 > 1) {
        println("100은 1보다 크다")
    }

    // (3)
    var a = 100
    if(a >= 100) {
        println("a는 100보다 크거나 같다.")
    }

    // (4)
    var greet = "Hello World"
    if(greet.startsWith("Hello")) {
        println("문자열은 Hello로 시작합니다.")
    }

    // (5)
    var age = 20
    var gender = "남성"
    if(age >= 20 && gender == "남성") {
        println("성인 남성입니다.")
    }

    println("--------------------")
    var num = 10
    if(num % 2 == 0) {
        println("짝수입니다.")
    } else {
        println("홀수입니다.")
    }

    println("--------------------")
//    var score = 100
//    // (1)
//    var grade: String
//    if(score == 100) {
//        grade = "A"
//    // (2)
//    } else if(score in 90 until 100) {
//        grade = "B"
//    // (3)
//    } else if(score in 80 until 90) {
//        grade = "C"
//    // (4)
//    } else {
//        grade = "D"
//    }
//    println("grade : $grade")

    var score = 50
    // (1)
    var grade: String? = null
    if(score == 100) {
        grade = "A"
    } else if(score in 90 until 100) {
        grade = "B"
    } else if(score in 80 until 90) {
        grade = "C"
    }
    println("grade : $grade")
}
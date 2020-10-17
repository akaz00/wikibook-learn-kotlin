package controlstudy

fun main(args : Array<String>) {
    var num1 = 100
    var num2 = 200

    // (1)
    var bigger = if(num1 > num2) num1 else num2

    println(bigger) // 200 출력

    println("--------------------")
    var score = 100
    var grade = if(score == 100) {
        // (1)
        println("Perfect")
        "A"
    } else if(score in 90 until 100) {
        println("Excellent")
        "B"
    } else if(score in 80 until 90) {
        println("Good")
        // (2)
        "ABCD".get(2)
    } else {
        println("Average")
        // (2)
        "D" + "+"
    }
    println("grade : $grade")
}
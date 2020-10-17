package challenges.ch04

fun main(args : Array<String>) {
    // Q) 거꾸로 별찍기
    println("거꾸로 별찍기 ver1")
    for(i in 5 downTo 1) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }

    println("거꾸로 별찍기 ver2")
    for(i in 5 downTo 1) {
        for(j in 1 until i) {
            print(" ")
        }
        print("*")
        println()
    }

//    println("삼각형 별찍기")
//    val row = 3
//    for(i in 1..row) {
//        for(j in 1..(i * 2)) {
//            print(" ")
//        }
//        for(j in 0..(1+i*2)) {
//            print("*")
//        }
//        println()
//    }

    // Q) 홀수 개수만 별찍기
    // step 사용 버전
    println("step 함수 사용한 홀수 개수의 별찍기")
    for(i in 1 .. 5 step 2) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }

    // continue 사용 버전
    println("continue 명령어 사용한 홀수 개수의 별찍기")
    for(i in 1 .. 5) {
        if((i % 2) == 0) continue
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}
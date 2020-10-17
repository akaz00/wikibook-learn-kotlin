package challenges.ch04

fun main(args : Array<String>) {
    print("숫자 입력 : ")
    val count = readLine()!!.toInt()
    for(i in count downTo 1) {
        print("$i ")
    }
    print("출발!")
}
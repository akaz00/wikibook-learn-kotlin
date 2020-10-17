package challenges.ch04

fun main(args : Array<String>) {
    print("검사할 수 입력 : ")
    var checkNumber = readLine()!!.toInt()

    var isPrime = true
    for(n in 2..(checkNumber-1)) {
        if((checkNumber % n) == 0) {
            isPrime = false
            break
        }
    }

    print("${checkNumber}는 소수? $isPrime")
}
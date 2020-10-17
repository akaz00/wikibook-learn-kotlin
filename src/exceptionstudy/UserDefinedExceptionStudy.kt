package exceptionstudy

class MyException(message: String="My Exception") : Exception(message)
class OnlyOddNumberAllowedException(message:String="짝수는 허용하지 않습니다.") : IllegalArgumentException(message)

fun main(args : Array<String>) {
    // throw MyException()

    print("홀수 입력 : ")
    var num = readLine()!!.toInt()
    if(num % 2 == 0) {
        throw OnlyOddNumberAllowedException()
    } else {
        println(num)
    }
}

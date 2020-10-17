package challenges.ch04

fun main(args : Array<String>) {
    // 1 ~ 100까지의 숫자를 출력하되, 3의 배수들은 “Fizz”, 5의 배수들을 “Buzz”, 3과 5의 배수들은 “FizzBuzz”를 출력하고 그 외는 그냥 숫자를 출력하는 프로그램을 만들라.
    for(i in 1 .. 100) {
        var result: String
        when {
            ((i % 3) == 0) && ((i % 5) == 0) -> result = "FizzBuzz"
            (i % 3) == 0 -> result = "Fizz"
            (i % 5) == 0 -> result = "Buzz"
            else -> result = i.toString()
        }
        print("$result ")
    }
}
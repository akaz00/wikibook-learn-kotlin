package variablestudy

fun main(args : Array<String>) {
    // var arr1: Array<Int> = Array<Int>(3){0}
    // var arr1 = Array(3){0}
    // 배열 초깃값을 100으로 하는 3개의 정수를 저장할 수 있는 배열 선언
    var arrInitHundred = Array(3){100}

    // 배열에 담긴 첫 번째 값 출력 (배열 초깃값을 100으로 지정했으므로 100을 출력)
    println(arrInitHundred[0])
    // 배열에 담긴 두 번째 값 출력 (배열 초깃값을 100으로 지정했으므로 100을 출력)
    println(arrInitHundred[1])
    arrInitHundred[2] = 200
    // 배열에 담긴 세 번째 값 출력 (단, 200으로 값을 변경하였으므로 200을 출력)
    println(arrInitHundred[2])

    // 배열 초깃값을 "Hello" 문자열로 하는 2개의 문자열을 저장할 수 있는 배열 선언
    var stringArr = Array(2){"Hello"}
    // 마지막 배열값을 "World"로 변경
    stringArr[1] = "World"

    println(stringArr[0])
    println(stringArr[1])

    // 100, 200, 300을 초깃값으로 갖는 정수 배열 선언
    var arr2 = arrayOf(1, 2, 3)
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])
}
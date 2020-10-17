package controlstudy

fun main(args : Array<String>) {
    // 1부터 10까지 범위를 가진 Range 객체 생성 예제
    var range = 1 .. 10
    println("range $range")
    println("range.first ${range.first}")
    println("range.last ${range.last}")

    // 1부터 10까지 반복하여 출력
    for(i in 1 .. 10) {
        println(i)
    }
    println("oneToTen end")

    // until을 쓸 경우 마지막 숫자는 제외한 범위가 만들어짐
    var oneToNine = 1 until 10
    println("range $oneToNine")
    println("range.first ${oneToNine.first}")
    println("range.last ${oneToNine.last}")

    // 1부터 9까지 출력
    for(v in oneToNine) {
        println(v)
    }
    println("oneToNine end")

    var arr = arrayOf(1, 2, 3)

    // .. 연산자를 이용할 경우 배열 객체의 크기에서 1만큼 뺀 범위로 범위 객체를 생성
    for(idx in 0 .. (arr.size - 1)) {
        println(arr[idx])
    }

    // 반면 until 함수를 이용할 경우 배열 객체의 크기를 그대로 전달해서 범위 객체를 생성 가능
    for(idx in 0 until arr.size) {
        println(arr[idx])
    }


    // 1부터 10까지의 순서를 역순으로 한 범위 객체 생성
    var tenToOne = 10 downTo 1

    // reversed 메소드를 이용하여 기존 범위 객체를 거꾸로 순회하는 범위 객체 생성
    var tenToOne2 = range.reversed()

    // var tenToOne = (1 .. 10).reversed()
    // 10부터 1까지 출력
    for(i in tenToOne) {
        println(i)
    }
    println("tenToOne end")

    // 1부터 2씩 증가하되 10보다 작은 범위 객체 생성
    var oneToTenStepTwo = 1 .. 10 step 2
    for(i in oneToTenStepTwo) {
        println(i)
    }
    println("oneToTenStepTwo end")

    // 10부터 2씩 감소하되 1보다 큰 범위 객체 생성
    var tenToOneStepTwo = 10.downTo(1).step(2)
    for(v in tenToOneStepTwo) {
        println(v)
    }
    println("tenToOneStepTwo end")

    // 문자 범위를 생성하는 것도 가능
    var aToZ = 'a' .. 'z'
    for(c in aToZ) {
        println(c)
    }
    println("\n'a'부터 'z'까지 출력 끝")

    // '가'부터 '낗'까지 출력
    var gaToNa = '가' until '나'
    for(c in gaToNa) {
        print(c)
    }
    println("\n'가'부터 '낗'까지 출력 끝")

}
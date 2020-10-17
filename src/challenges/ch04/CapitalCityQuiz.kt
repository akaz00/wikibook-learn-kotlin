package challenges.ch04

fun main(args : Array<String>) {
    val countries = arrayOf("한국", "미국", "일본", "중국", "러시아")
    val cities = arrayOf("서울", "워싱턴", "도쿄", "베이징", "모스크바")

    // nextInt 함수는 0부터 함수로 전달한 정수 미만 범위까지 난수를 반환 (즉, 여기서는 0부터 4까지 범위의 난수값을 반환)
    val selectedIdx = kotlin.random.Random.nextInt(5)

    val selectedCountry = countries[selectedIdx]
    val selectedCity = cities[selectedIdx]

    print("${selectedCountry}의 수도는? ")
    val answer = readLine()!!

    if(answer == selectedCity) {
        println("정답입니다.")
    } else {
        println("오답입니다. (정답 : $selectedCity)")
    }
}

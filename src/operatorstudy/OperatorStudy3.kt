package operatorstudy

import java.util.*

fun main(args : Array<String>) {
    // 인덱스 연산자 사용 (대괄호 내부에 인덱스 번호를 입력하여 값에 접근)
    // 100, 200, 300 값으로 구성된 배열을 생성
    var nums = arrayOf(100, 200, 300)

    // 첫 번째 위치에 저장된 값을 조회
    println("nums[0] : " + nums[0])
    // 두 번째 위치에 저장된 값을 조회
    println("nums[1] : " + nums[1])
    // 세 번째 위치에 저장된 값을 조회
    println("nums[2] : " + nums[2])

    // 배열의 두 번째 위치에 저장된 값을 400으로 변경
    nums[1] = 400
    // 변경된 값 출력
    println(nums[1])

    // 잘못된 위치값(배열의 크기를 넘어가는 숫자)을 이용해 접근할 경우ArrayIndexOutOfBoundsException 오류가 발생
    println(nums[3])

    var areaCodeMap = mutableMapOf("02" to "서울", "031" to "경기")
    println(areaCodeMap["02"])
    println(areaCodeMap["031"])
    areaCodeMap["051"] = "부산"
    println(areaCodeMap["051"])
}
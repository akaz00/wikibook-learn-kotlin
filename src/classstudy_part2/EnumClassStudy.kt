package classstudy_part2

import kotlin.random.Random

// 제한된 카테고리의 값을 가지는 경우 enum class 사용
enum class Color {
    RED, GREEN, BLUE
}

// 난이도와 관련된 열거형 클래스
enum class Difficulty {
    EASY, STANDARD, HARD
}

// 방향과 관련된 열거형 클래스
enum class Direction {
    EAST, WEST, SOUTH, NORTH
}

// 열거형 클래스는 속성을 가질 수 있음 (주 생성자에 두 상수 값을 적용할 수 있도록 함)
enum class Shortcut(val key: String, val description: String) {
    UNDO("Ctrl + Z", "가장 최근에 실행한 명령어를 취소합니다."),
    REDO("Ctrl + Y", "가장 최근에 취소된 명령어를 다시 실행합니다.")
}

/*
enum class GameRank(val point: Int) {
    BRONZE(10), SILVER(50), GOLD(100);

    // 랭크와 관련된 이름과 포인트 값을 반환하는 메소드
    fun getRankAndPoint() = this.name to point
}
*/

interface RankAndPointInterface {
    fun getRankAndPoint(): Pair<String, Int>
}

// (1)
enum class GameRank_ : RankAndPointInterface {
    BRONZE {
        // (2)
        override fun getRankAndPoint() = this.name to 10
    },
    SILVER {
        override fun getRankAndPoint() = this.name to 50
    },
    GOLD {
        // (3)
        override fun getRankAndPoint() = this.name to Random.nextInt(100, 200)
    }
}

fun main(args : Array<String>) {

    var color1: Color = Color.RED
    var color4: Color = Color.RED
    println(color1 === color4)
    var color2 = Color.valueOf("GREEN") // Color.GREEN와 같은 대입 결과

    // 해당 열거형 클래스의 모든 상수값들을 순회
    for(color in Color.values()) {
        println("ordinal : ${color.ordinal}, name : ${color.name}")
    }

    var difficulty1: Difficulty = Difficulty.EASY
    var difficulty2 = Difficulty.valueOf("HARD") // Difficulty.HARD와 같은 대입 결과

    var direction = Direction.SOUTH

    println(color1.name) // 상수 이름인 RED 출력
    println(direction.name) // 상수 이름인 SOUTH 출력

    println(color1.ordinal) // RED는 1번째로 정의된 상수이므로 0을 반환
    println(color2.ordinal) // GREEN은 2번째로 정의된 상수이므로 1을 반환

    var undo = Shortcut.UNDO

    println(undo.name) // 이름 (UNDO)
    println(undo.ordinal) // 정의된 순서 (0번째)

    // 속성값 접근
    println(undo.key) // 입력키
    println(undo.description) // 설명

    var bronzeRank = GameRank_.BRONZE
    var silverRank = GameRank_.SILVER
    var goldRank = GameRank_.GOLD
    println(bronzeRank.getRankAndPoint())
    println(silverRank.getRankAndPoint())
    println(goldRank.getRankAndPoint())

    // 임의의 숫자를 부여하여 상수 생성
    val RED = 1
    val GREEN = 2
    val BLUE = 3

    // 올바른 대입
    var color = RED

    // 단, color에 다음과 같이 정의되지 않은 값을 대입할 수 있는 실수가 발생할 수 있음
    color = 4
}
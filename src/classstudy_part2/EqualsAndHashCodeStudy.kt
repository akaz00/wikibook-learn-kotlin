package classstudy_part2

import java.time.LocalDate

class PersonOverrideNothing(var name: String, var age: Int, val birthDate: LocalDate)

class PersonOverrideEqualsAndHashCode(var name: String, var age: Int, val birthDate: LocalDate) {
    // 자동 생성된 내용 동등 비교(equals) 메소드
    override fun equals(other: Any?): Boolean {
        // 같은 참조라면 같은 객체이므로 참 반환
        if (this === other) return true
        // 같은 클래스가 아니라면 거짓 반환
        if (javaClass != other?.javaClass) return false

        // 같은 클래스이므로 형 변환 진행
        other as PersonOverrideEqualsAndHashCode

        // equals 메소드 생성하며 추가한 모든 속성값을 동등 비교
        if (name != other.name) return false
        if (age != other.age) return false
        if (birthDate != other.birthDate) return false

        // 모든 속성값이 같다면 참 반환
        return true
    }

    // 객체의 hashCode 계산 메소드
    // hashCode 메소드 생성하며 추가한 모든 속성값의 hashCode 값을 계산하여 더하고 최종적으로 하나의 정수값을 반환
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + birthDate.hashCode()
        return result
    }
}

class PersonOverrideEquals(var name: String, var age: Int, val birthDate: LocalDate) {
    // equals 메소드만 재정의
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PersonOverrideEquals

        if (name != other.name) return false
        if (age != other.age) return false
        if (birthDate != other.birthDate) return false

        return true
    }
}

fun main(args : Array<String>) {

    // hashCode 오버라이딩의 중요성
    /*
    equals 메소드와 hashCode 메소드의 계약

    1) 만약 두 객체가 논리적으로 같다면(equals 메소드 리턴 값이 true), 두 객체는 반드시 같은 해시 코드를 반환해야 한다. => 만약 두 객체가 다른 해시 코드를 반환한다면 그 객체는 논리적으로 같지 않다고 판단해도 무방함
    2) 만약 두 객체가 같은 해시 코드를 반환한다면 그 두 객체는 논리적으로 같을 수도 다를 수도 있다. (즉, 같은 해시 코드를 반환했다고 해서 무조건 논리적으로 같은 객체라고 볼 수는 없음)
    */

    val p1 = PersonOverrideNothing("김철수", 20, LocalDate.parse("2000-01-01"))
    val p2 = PersonOverrideNothing("김철수", 20, LocalDate.parse("2000-01-01"))
    println(p1 == p2)
    println(p1 === p2)
    println(p1.hashCode())
    println(p2.hashCode())

    val p3 = PersonOverrideEqualsAndHashCode("김철수", 20, LocalDate.parse("2000-01-01"))
    val p4 = PersonOverrideEqualsAndHashCode("김철수", 20, LocalDate.parse("2000-01-01"))
    println(p3 == p4)
    println(p3 === p4)
    println(p3.hashCode())
    println(p4.hashCode())

    val map1 = mutableMapOf<PersonOverrideNothing, Int>()
    map1.put(p1, 1000)
    map1.put(p2, 2000)
    println(map1.size) // 2
    println(map1.get(p1)) // 1000
    println(map1.get(p2)) // 2000

    val map2 = mutableMapOf<PersonOverrideEqualsAndHashCode, Int>()
    map2.put(p3, 1000)
    map2.put(p4, 2000)
    println(map2.size) // 1
    println(map2.get(p3)) // 2000
    println(map2.get(p4)) // 2000

    //
    val set1 = mutableSetOf(p1)
    set1.add(p2)
    //
    println(set1.size) // 2

    val set2 = mutableSetOf(p3)
    set2.add(p4)
    println(set2.size) // 1

    // equals는 유용해보이니까 오버라이딩하고 hashCode는 굳이 필요 없어보이고 뭔지 모르겠으니까 안하면?
    val p5 = PersonOverrideEquals("김철수", 20, LocalDate.parse("2000-01-01"))
    val p6 = PersonOverrideEquals("김철수", 20, LocalDate.parse("2000-01-01"))

    // 계약에 의해서 hashCode가 같으면 무조건 논리적으로 동등한 객체이므로 *먼저 hashCode를 비교*
    // 논리적으로 동등
    println(p5 == p6)
    // 그러나 hashCode는 다름 (계약 위반)
    println(p5.hashCode())
    println(p6.hashCode())

    val map3 = mutableMapOf<PersonOverrideEquals, Int>()
    map3.put(p5, 1000)
    map3.put(p6, 2000)
    println(map3.size) // 2
    println(map3.get(p5)) // 1000
    println(map3.get(p6)) // 2000

    val set3 = mutableSetOf(p5)
    set3.add(p6)
    println(set3.size) // 2
}
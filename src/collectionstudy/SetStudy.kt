package collectionstudy

fun main(args : Array<String>) {

    // 변경 가능한 집합 생성
    var mutableSet = mutableSetOf("one", "two", "three")

    // 값 추가
    mutableSet.add("four")
    println(mutableSet)

    // 중복된 값은 추가할 수 없음
    mutableSet.add("one")
    mutableSet.add("two")
    mutableSet.add("three")
    println(mutableSet)

    mutableSet.remove("one")
    println(mutableSet)

    // get 메소드나 인덱스 접근 연산자 사용 불가
    // mutableSet.get(0)
    // mutableSet[0]

    for(s in mutableSet.iterator()) {
        print("$s ")
    }
    println()
}
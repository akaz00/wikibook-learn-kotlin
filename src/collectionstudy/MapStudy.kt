package collectionstudy

fun main(args : Array<String>) {
    // 맵(Map)
    var pair : Pair<String, Int> = "key1" to 1

    // Pair 타입의 vargs를 받음
    var mutableMap = mutableMapOf("key1" to 1, "key2" to 2)
    println(mutableMap)

    var emptyMutableMap = mutableMapOf<String, Int>()
    println(emptyMutableMap)

    var mutableMap2 = mutableMapOf("key1" to 1, "key2" to 2)
    mutableMap2.put("key3", 3)
    println(mutableMap2)
    // 이미 존재하는 키에 값을 쓰면 덮어쓰기 방식(overwrite)으로 동작하므로 값 변경 가능
    mutableMap2.put("key1", 100)
    println(mutableMap2)

    var mutableMap3 = mutableMapOf("key1" to 1, "key2" to 2)
    mutableMap3.remove("key2")
    println(mutableMap3)

    var mutableMap4 = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3)

    // get 메서드를 호출해 값에 접근
    var valueFromKey3 = mutableMap4.get("key3")
    // 인덱스 접근 연산자를 사용해 값에 접근
    var valueFromKey3_ = mutableMap4["key3"]

    println(valueFromKey3)
    println(valueFromKey3_)

    var immutableMap = mapOf("key1" to 1, "key2" to 2)
    var valueFromKey1 = immutableMap["key1"]
    // 새 값 추가는 불가
    // immutableMap.put("key3", 3)

    // 비어 있는 맵 선언, 키와 값의 타입을 모두 지정해야 함!
    var empty = emptyMap<String, String>()
    println(empty)
}
package collectionstudy

fun main(args : Array<String>) {
    // 리스트(List)
    // mutableListOf 함수로 변경 가능한 리스트 선언
    var mutableList = mutableListOf('a', 'b', 'c') // 몇 개의 시작하는 원소와 함께 변형 가능한 리스트 만들기
    // 비어있는 리스트는 타입 정보를 유추할 수 없으므로 리스트에 포함된 자료의 타입을 명시
    var emptyMutableList = mutableListOf<Char>()

    mutableList.add('d') // 맨 뒤에 원소 삽입 (a, b, c, d)
    println(mutableList)
    mutableList.add(3, 'e') // 특정 위치에 원소 삽입 (a, b, c, e, d)
    println(mutableList)

    mutableList.remove('a') // (b, c, e, d)
    mutableList.removeAt(0) // 첫 번째 원소 삭제 (c, e, d)
    println(mutableList)

    // get 메서드를 이용해 접근
    var valueAt0 = mutableList.get(0)
    // 인덱스 접근 연산자를 이용해 접근
    var valueAt0_ = mutableList[0]

    println(valueAt0)
    println(valueAt0_)

    for(item in mutableList) {
        print("$item ")
    }
    println()

    // 현재 mutableList에 포함된 글자는 c, e, d
    println(mutableList.contains('c')) // true
    println(mutableList.contains('a')) // false

    println(mutableList.size) // 원소의 개수 확인

    // + 연산자로 두 리스트를 합칠 수 있음
    var merged = listOf(1, 2, 3) + listOf(4, 5, 6) // merged의 원소는 (1, 2, 3, 4, 5, 6)
    println(merged)

    // - 연산자로 앞의 리스트에서 뒤의 리스트의 내용을 삭제한 리스트를 얻을 수 있음
    // (중복되어 있는 내용도 모두 삭제됨을 유의!)
    var subtracted = listOf(1, 2, 3, 4, 5, 6, 2, 4, 6) - listOf(2, 4, 6, 8) // subtracted의 원소는 (1, 3, 5)
    println(subtracted)

    // slice 메소드 호출로 리스트 내용의 일부를 추출하여 리스트 생성 가능
    var sliced = listOf('a', 'b', 'c', 'd', 'e', 'f').slice(2..4) // 2번 인덱스의 값('c')부터 4번 인덱스의 값('d')까지 원소를 추출, sliced의 원소는 (c, d, e)
    println(sliced)

    // listOf 함수로 변경 불가능한 리스트 선언
    var immutableList = listOf(1, 2, 3) // 원소 삽입, 삭제, 수정 불가! (읽기 전용 리스트)

    // immutableList.add(4) // 불가
    // immutableList.remove(5) // 불가
    println(immutableList[0]) // 값을 읽어 오는 것은 가능!

    // toMutableList 메소드를 호출하여 수정 가능한 리스트로 변환 가능
    var immutableToMutableList = immutableList.toMutableList()
    immutableToMutableList.add(4)
    immutableToMutableList.add(5)
    println(immutableToMutableList)

    var mutableToImmutableList = mutableList.toList()

    // 배열로 변환 가능
    var charArr : CharArray = mutableList.toCharArray()
    // 내부 값의 타입이 Int이므로 toIntArray 메서드 호출
    var intArr : IntArray = mutableListOf(1, 2, 3, 4, 5).toIntArray()

    // 비어있는 리스트 대입
    var empty = emptyList<Int>()

    val li = listOf<Char>()
    // 비어있는 리스트인지 여부 검사
    if(li == emptyList<Char>()) {
        print("비어있는 리스트")
    } else {
        print("비어있지 않은 리스트")
    }
}
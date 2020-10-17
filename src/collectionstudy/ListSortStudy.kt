package collectionstudy

data class Movie(val name: String, val rating: Int)

fun main(args : Array<String>) {
    val nums = listOf(1, 5, 7, 6, 9, 10, 2, 8, 4, 3)
    println("기존 리스트 : $nums")
    val numsSorted = nums.sorted()
    println("오름차순 정렬된 리스트 : $numsSorted")
    val numsDescSorted = nums.sortedDescending()
    println("내림차순 정렬된 리스트 : $numsDescSorted")

    val fruits = listOf("Durian", "Carrot", "Apple", "Banana")
    val fruitsSorted = fruits.sorted()
    println("정렬된 과일 리스트 : $fruitsSorted")

    // 영화 데이터 추가
    var movies = listOf(
        Movie("카사블랑카", 90),
        Movie("시민케인", 100),
        Movie("바람과 함께 사라지다", 95),
        Movie("대부", 89)
    )

    // (1)
    var sorted1 = movies.sortedBy {
        it.rating
    }
    println("평점(오름차순) 정렬 : $sorted1")

    // (2)
    var sorted2 = movies.sortedByDescending {
        it.rating
    }
    println("평점(내림차순) 정렬 : $sorted2")

    // (3)
    var sorted3 = movies.sortedByDescending {
        it.name.length
    }
    println("영화 이름 길이(내림차순) 정렬 : $sorted3")

    val comparator = Comparator<Movie> {
        obj1, obj2 ->
        when {
            // 첫 번째로 전달된 값과 두 번째로 전달된 값이 같으면 0을 반환
            obj1.name.length == obj2.name.length -> 0
            // 첫 번째로 전달된 값이 두 번째로 전달된 값보다 작으면 음수를 반환
            obj1.name.length < obj2.name.length -> -1
            // 첫 번째로 전달된 값이 두 번째로 전달된 값보다 크면 양수를 반환
            else -> 1
        }
    }
    var sorted4 = movies.sortedWith(comparator)
    println("영화 이름 길이(오름차순) 정렬 : $sorted4")
}
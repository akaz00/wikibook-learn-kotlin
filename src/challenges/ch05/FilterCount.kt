package challenges.ch05

// 특정 조건을 만족시키는
fun filterCount(vararg nums: Int, f: (Int)->Boolean) : Int {
    var count = 0
    for(n in nums) {
        count += if(f(n)) 1 else 0
    }
    return count
}

fun main(args : Array<String>) {
    var count1 = filterCount(1, 2, 3, 4, 5) {
        (it % 2) == 0
    }
    println(count1)

    var count2 = filterCount(1, 2, 3, 4, 5, 6) {
        it >= 3
    }
    println(count2)
}
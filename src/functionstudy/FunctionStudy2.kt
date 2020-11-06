package functionstudy

fun sumWithDefault(a: Int=10, b: Int=20): Int {
    return a + b
}

fun sumWithDefault2(a: Int, b: Int=20): Int {
    return a + b
}

// vargs

// (1)
fun sumWithVargs(vararg nums: Int): Int {
    var total = 0
    // (2)
    for(num in nums) {
        total += num
    }
    return total
}

fun sumWithVargsWithBase(base: Int, vararg nums: Int): Int {
    var total = base
    for(num in nums) {
        total += num
    }

    return total
}

fun concatAllString(vararg strs: String): String {
    var result = ""
    for(s in strs) {
        result += s
    }
    return result
}

fun main(args : Array<String>) {
    println(sumWithDefault()) // (1)
    println(sumWithDefault(20)) // (2)
    println(sumWithDefault(20, 30)) // (3)
    println(sumWithDefault(b=30)) // (4)
    println(sumWithDefault(30)) // (5)

    // println(sumWithDefault2()) // a 인자값 전달은 필수, 호출 불가
    println(sumWithDefault2(100)) // 120 반환

    var sum1 = sumWithVargs(1, 2, 3, 4, 5)
    println(sum1)

    var sum2 = sumWithVargs(1, 2, 3)
    println(sum2)

    var sumWithBase = sumWithVargsWithBase(100, 10, 20, 30, 40, 50)
    println(sumWithBase)

    var numList = listOf(1, 2, 3, 4, 5)
    var charSet = setOf("a", "b", "c")

    val objArr = arrayOf(1, 2, 3)
    // var sum3 = sumWithVargs(*objArr)
    var sum3 = sumWithVargs(*(objArr.toIntArray()))
    println(sum3)

    var doubleArr = arrayOf(1.0, 2.0, 3.0)
    var primDoubleArr = doubleArr.toDoubleArray()
    var charArr = arrayOf('a', 'b', 'c')
    var primCharArr = charArr.toCharArray()

    val primArr = intArrayOf(1, 2, 3)
    var sum4 = sumWithVargs(*primArr)
    println(sum4)

    concatAllString(*arrayOf("Hello", "Kotlin"))
}
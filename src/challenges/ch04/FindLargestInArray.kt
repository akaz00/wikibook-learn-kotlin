package challenges.ch04

fun main(args : Array<String>) {
    val nums = arrayOf(7, 5, 7, 8, 9, 9, 1, 2, 3)
    var largest = nums[0]

    if(nums.size != 1) {
        for (n in nums) {
            if (n > largest) {
                largest = n
            }
        }
    }

    println(largest)
}
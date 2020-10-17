package challenges.ch05

fun excludeChar(str: String, excludes: Array<Char>): String {
    var result = ""

    for(s in str) {
        if(s in excludes) continue
        result += s
    }

    return result
}

fun main(args : Array<String>) {
    var str1 = excludeChar("Hello", arrayOf('H', 'l'))
    var str2 = excludeChar("Hello World", arrayOf('H', 'W', 'o'))
    println(str1)
    println(str2)
}
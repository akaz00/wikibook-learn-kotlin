package functionstudy

fun outerFunc(target: String) : String {
    fun localFunc(str: String) : String {
        return "Hello from local $str"
    }

    return localFunc(target)
}

fun main(args : Array<String>) {
    var result = outerFunc("Outer")
    println(result)
}
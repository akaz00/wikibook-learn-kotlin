package exceptionstudy

fun main(args : Array<String>) {
    // throw 키워드를 사용하여 직접 예외 발생 가능
    // throw Exception("예외 발생!")

    // try - catch 표현식을 이용한 값 대입
    var value = try {
        throw Exception("exception")
        1
    } catch(e: Exception) {
        println("catch")
        2
    } finally {
        3
    }
    println(value)

    val name = try {
        print("이름 입력 : ")
        var name = readLine()!!
        if(name.length >= 10) {
            throw Exception("이름이 너무 깁니다.")
        }
        name
    } catch(e: Exception) {
        println(e.message)
        null
    }
    println(name)
}
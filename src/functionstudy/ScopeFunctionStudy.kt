package functionstudy

data class Point(var x: Int = 0, var y: Int = 0)

fun main(args : Array<String>) {
    var p1 = Point(1, 2)

    /* let 함수 : 람다 함수의 인자값(it)으로 객체 전달, 람다 함수의 반환값을 결과값으로 사용 */
    println("let function demo")
    var nullableString : String? = "Hello"
    // 오직 null이 아닌 경우에만 람다 함수가 실행
    nullableString?.let {
        // 내부에서 it을 통해 객체 접근 가능
        println(it.length)
    }

    // 만약 nullableString이 null이었다면 그냥 null값이 대입
    var upper = nullableString?.let {
        // 대문자로 변경한 값이 반환되어 upper 변수에 대입
        it.toUpperCase()
    }
    println(upper)

    p1?.let{
        it.x *= 2
        it.y *= 2
    }
    println(p1)

    /* with 함수 : 람다 함수에서 this 키워드를 통해 객체 접근, 람다 함수의 반환값을 결과값으로 사용 */
    println("\nwith function demo")
    var str = "Hello, KOTLIN"
    var lower = with(str) {
        toLowerCase()
    }
    println(lower)

    /* run 함수 : 람다 함수에서 this 키워드를 통해 객체 접근, 람다 함수의 반환값을 결과값으로 사용 */
    println("\nrun function demo")
    var pointToPair = p1.run {
        Pair(x, y)
    }
    println(pointToPair)

    // 특별히 객체에 run 메소드를 쓰지 않아도 호출 가능
    // (객체의 초기화 작업에 사용할 임시 변수를 바깥 영역에서 숨기고자 할 때 유용하게 사용 가능)
    var p3 = run {
        var x = 100
        var y = 200
        Point(x, y)
    }
    println(p3)

    /* apply : 람다 함수에서 this 키워드를 통해 객체 접근, 결과값으로 사용한 객체를 반환 */
    println("\napply function demo")
    var p2 = p1.apply {
        x = 100
        y = 200
        // 람다의 마지막 식이 결과값이 되어 대입되지 않음을 유의 (객체 자체를 반환)
        "Hello"
    }
    println(p2)
    // 돌려받은 객체는 완전히 참조가 같은 객체임을 유의
    println(p1 === p2)


    /* also : 람다 함수의 인자값(it)으로 객체 전달, 결과값으로 사용한 객체를 반환 */
    println("\nalso function demo")
    var words = mutableListOf("Hello", "World")
    // also 내부에서 가능하면 객체 변경 작업을 하지 않는 것을 권장
    words.also {
        // 그냥 조회(read-only) 작업만 진행 (ex: 로깅 작업 혹은 디버깅을 위한 콘솔 출력)
        println("first item : ${it.first()}")
        println("last item : ${it.last()}")
        println("list size : ${it.size}")
    }.add("Kotlin")
    println(words)
}
package functionstudy

fun sayHelloTo(from: String, to: String, times: Int) {
    // (.. 코드 내용 ..)
}

fun main(args : Array<String>) {
    sayHelloTo(from="김철수", to="이영희", times=3) // (1)
    sayHelloTo(times=3, to="이영희", from="김철수") // (2)
    sayHelloTo("김철수", times=3, to="이영희") // (3)
    // sayHelloTo(times=3, "김철수", "이영희") // (4) 호출 불가
}

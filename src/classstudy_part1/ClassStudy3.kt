package classstudy_part1

class Person6(var name: String, var age: Int, val gender: String) {
    var job: String = "Unknown"
    var salary: Int? = null

    // (1) 직업(job)까지 정의할 수 있는 생성자 추가
    // this(name, age, gender)는 주 생성자를 호출
    constructor(name: String, age: Int, gender: String, job: String) : this(name, age, gender) {
        println("from constructor(name: String, age: Int, gender: String, job: String)")
        this.job = job
    }

    // 위에서 생성자와 완전히 같은 순서와 타입의 인자를 전달(String, Int, String, String)하는 추가 생성자는 정의할 수 없음
    /*
    constructor(name: String, age: Int, gender: String, job: String) : this(name, age, gender) {
        println("from constructor(name: String, age: Int, gender: String, job: String)")
        this.age = age / 2
        this.job = "job is $job"
    }
    */

    // (2) 직업(job)과 연봉(salary)까지 정의할 수 있는 생성자 추가
    // this(name, age, gender, job)는 (1)에서 정의한 보조 생성자를 호출
    constructor(name: String, age: Int, gender: String, job: String, salary: Int) : this(name, age, gender, job) {
        println("from constructor(name: String, age: Int, gender: String, job: String, salary: Int)")
        this.salary = salary
    }
}

// class Person6(var name: String, var age: Int, val gender: String, var job: String = "Unknown", var salary: Int? = null) {}

class ThisReferenceDemoClass {
    var prop: Int

    constructor(prop: Int) {
        // (1)
        this.prop = prop
    }

    fun myFunc() {
        // (2)
        println("${this}")

        // (3)
        println("${this.prop}")

        // (4)
        println("${prop}")
    }

    fun anotherFunc() {
        // (5)
        this.myFunc()
    }
}

fun main(args : Array<String>) {

    var p6 = Person6("김철수", 20, "남성")
    println("${p6.name} ${p6.age} ${p6.gender} ${p6.job} ${p6.salary}") // (1)

    p6 = Person6("이영희", 30, "여성", "의사")
    println("${p6.name} ${p6.age} ${p6.gender} ${p6.job} ${p6.salary}") // (2)

    p6 = Person6("이영희", 30, "여성", "의사", 20000)
    println("${p6.name} ${p6.age} ${p6.gender} ${p6.job} ${p6.salary}") // (3)

    // 객체 생성 가능(모든 속성값의 이름을 직접 기입)
    var p61 = Person6(name="철수", age=20, gender="남성", job="프로그래머")

    // 객체 생성 가능(명명 인자 방식 사용 시 원래 순서를 무시해도 무방)
    var p62 = Person6(job="프로그래머", gender="남성", age=20, name="철수")

    // 객체 생성 가능(앞부분은 생성자에 정의된 순서대로 값을 전달하고 뒷부분은 이름을 이용해 대입)
    var p63 = Person6("철수",20, gender="남성", job="프로그래머")

    // 객체 생성 가능(앞부분은 생성자에 정의된 순서대로 값을 전달하고 뒷부분은 순서에 관계없이 이름을 이용해 대입)
    var p64 = Person6("철수",20, job="프로그래머", gender="남성")

    // 객체 생성 불가
    // var p65 = Person6(gender="남성", job="프로그래머", "철수", 20)

    println("--------------------")
    var t1 = ThisReferenceDemoClass(100)
    t1.anotherFunc()

    var t2 = ThisReferenceDemoClass(200)
    t2.anotherFunc()
}
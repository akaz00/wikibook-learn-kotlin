package classstudy_part1

open class Person(var name: String, var age: Int, val gender: String) {
    fun eat(food: String) {
        println("${name}가 ${food}을 먹습니다.")
    }
    fun sleep(hour: Int) {
        println("${name}가 ${hour}시간동안 잠을 잡니다.")
    }
}

class Employee(name: String, age: Int, gender: String, var company: String, var salary: Int, var position: String) : Person(name, age, gender) {
    fun work(hour: Int) {
        println("${company} 회사에 소속된 ${name}가 ${hour}시간동안 일을 합니다.")
    }
}

/*
class EmployeeWithoutInheritance(var name: String, var age: Int, val gender: String, var company: String, var salary: Int, var position: String) {
    fun eat(food: String) {
        println("${name}가 ${food}을 먹습니다.")
    }
    fun sleep(hour: Int) {
        println("${name}가 ${hour}시간동안 잠을 잡니다.")
    }
    fun work(hour: Int) {
        println("${company} 회사에 소속된 ${name}가 ${hour}시간동안 일을 합니다.")
    }
}
*/

/*
open class Parent {}
class Child : Parent() {}
*/

open class Parent(var parentProp: Int) {
    fun parentFunc() {
        println("from parentFunc")
    }
}

class Child(prop: Int, var childProp: Int) : Parent(prop) {
    fun childFunc() {
        println("${super.parentProp}")
        println("${parentProp}")
        super.parentFunc()
        parentFunc()
    }
}

fun main(args : Array<String>) {

    var emp1 = Employee("김철수", 25, "남성", "삼성", 10000, "사원")
    var emp2 = Employee("이영희", 42, "여성", "LG", 20000, "과장")
    // (1) 물려받는 메소드를 사용
    emp1.eat("밥")
    emp1.sleep(6)

    // (2) 상속을 받으며 추가한 고유한 메소드를 사용
    emp2.work(8)

    println("--------------------")
    var p = Parent(100)
    println("${p.parentProp}")
    var c = Child(200, 300)
    println("${c.parentProp} ${c.childProp}")
}
package classstudy_part2

data class Person(var name: String, var age: Int)

data class Person2(var name: String, var age: Int) {
    var job: String = "Unknown"
}

class PersonNotData(var name: String, var age: Int) {
    operator fun component1() = age
    operator fun component2() = name
}

fun main(args : Array<String>) {

    var p1 = Person("김철수", 20)
    var p2 = Person("김영희", 30)
    var p3 = Person("김철수", 20)

    var personToString = p1.toString()
    println(personToString)
    println(p1)

    println(p1 == p2)
    println(p1 == p3)
    println(p1 === p3)

    // (1)
    var copied1 = p1.copy()
    println(copied1)
    println(p1 === copied1)

    // (2)
    var copied2 = p1.copy(name="박철수")
    var copied3 = p1.copy(age=50)
    println(copied2)
    println(copied3)

    /*
    println(p1.component1())
    println(p1.component2())
    */

    // 구조 분해 할당

    var (p1Name, p1Age) = p1
    /*
    var p1Name = p1.component1()
    var p1Age = p1.component2()
    */
    println(p1Name)
    println(p1Age)

    var personPair = Pair("이영희", 30)
    var (pairName, pairAge) = personPair

    var personTriple = Triple("박철수", 30, "경찰")
    var (tripleName, tripleAge, tripleJob) = personTriple
    // var (tripleName, tripleAge) = personTriple
    // var (_, tripleAge, tripleJob) = personTriple




    // hashCode

    println(p1.hashCode())
    println(p2.hashCode())
    println(p3.hashCode())

    var pe1 = Person2("김철수", 30)
    var pe2 = Person2("김철수", 30)
    println(pe1) // (1)

    // (2)
    pe1.job = "공무원"
    pe2.job = "회사원"
    // (2) 직업 정보가 다르지만 true
    println(pe1 == pe2)

    var pe4 = pe1.copy() // (3)
    println(pe4.job) // "Unknown" 출력 (copy할 때 name, age만 복사)

    //
    // var pe1Job = pe1.component3()

    var p = PersonNotData("박영호", 18)
    val (pAge, pName) = p
    println(pAge)
    println(pName)

}
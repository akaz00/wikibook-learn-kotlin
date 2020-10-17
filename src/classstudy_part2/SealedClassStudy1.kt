package classstudy_part2

//
public sealed class SealedParent {
    abstract fun abstractMethod()
}
//
class Child1 : SealedParent() {
    override fun abstractMethod() = println("from child 1")
}
class Child2 : SealedParent() {
    override fun abstractMethod() = println("from child 2")
}
class Child3 : SealedParent() {
    override fun abstractMethod() = println("from child 3")
}

fun main(args : Array<String>) {

    // (1)
    // val parent = SealedParent()

    // (2)
    val child1 = Child1()
    val child2 = Child2()
    val child3 = Child3()

    // (1)
    val parent : SealedParent = child1

    // (2)
    val childType1 = when(parent) {
        is Child1 -> 1
        is Child2 -> 2
        is Child3 -> 3
        // (3)
        // else 브랜치 불필요
    }

    // (4)
    val childType2 = when(parent) {
        is Child1 -> 1
        else -> null
    }
}
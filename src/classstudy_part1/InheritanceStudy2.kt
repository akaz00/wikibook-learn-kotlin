package classstudy_part1

open class Parent2() {
    // parentFunc 메소드는 재정의(override) 불가
    fun parentFunc() {
        println("from parentFunc")
    }

    // 재정의 가능한 메소드 선언
    open fun overridableParentFunc() {
        println("from overridableParentFunc")
    }
    open fun overridableParentFuncWithArg(arg1: Int, arg2: String) {
        println("from overridableParentFuncWithArg(${arg1}, ${arg2})")
    }
}

class Child2 : Parent2() {
    // 재정의 불가
    // 'parentFunc' in 'Parent2' is final and cannot be overridden
    /*
    override fun parentFunc() {
        println("from overrided parentFunc")
    }
    */

    override fun overridableParentFunc() {
        println("from overrided overridableParentFunc")
    }

    override fun overridableParentFuncWithArg(arg1: Int, arg2: String) {
        super.overridableParentFuncWithArg(arg1, arg2)
        println("from overrided overridableParentFuncWithArg(${arg1}, ${arg2})")
    }
}

fun main(args : Array<String>) {

    var p = Parent2()
    p.parentFunc()
    p.overridableParentFunc()
    p.overridableParentFuncWithArg(100, "Hello")

    var c = Child2()
    c.parentFunc()
    c.overridableParentFunc()
    c.overridableParentFuncWithArg(200, "World")
}
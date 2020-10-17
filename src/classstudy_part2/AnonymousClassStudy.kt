package classstudy_part2

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JButton

open class OpenClass {
    fun func1() {
        println("from func1")
    }
    open fun func2() {
        println("from func2")
    }
}

abstract class MyAbstractClass {
    var x: Int = 10
    var s: String = "Hello"

    fun concreteFunction() {
        println("from concrete")
    }
    abstract fun abstractFunction()
}

interface MyInterface {
    fun abstractFunction()
}

fun main(args : Array<String>) {
    // (1) 클래스를 상속하는 익명 클래스 선언 및 객체 생성
    var o = object : OpenClass() {
        override fun func2() {
            println("from func2 (override)")
        }
    }
    o.func1()
    o.func2()

    // (2)
    var ab = object : MyAbstractClass() {
        override fun abstractFunction() {
            println("from abstract")
        }
    }
    println(ab.x)
    println(ab.s)
    ab.concreteFunction()
    ab.abstractFunction()

    // (3)
    var i = object : MyInterface {
        override fun abstractFunction() {
            println("from abstract")
        }
    }
    i.abstractFunction()

    // adHoc 클래스 만들기
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0

        fun print() {
            println("$x $y")
        }
    }
    adHoc.print()

    //
    var btn = JButton("Button")
    btn.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            println(e)
            println("Button clicked!")
        }
    })
    //
    btn.addActionListener {
        e ->
        println(e)
        println("Button clicked!")
    }
    //
    btn.addActionListener {
        println(it)
        println("Button clicked!")
    }
    //
    val listener = ActionListener {
        println(it)
        println("Button clicked!")
    }
    btn.addActionListener(listener)

    //
    btn.addMouseListener(object : MouseListener {
        override fun mouseReleased(e: MouseEvent?) {
            println("mouseReleased")
        }
        override fun mouseEntered(e: MouseEvent?) {
            println("mouseEntered")
        }
        override fun mouseClicked(e: MouseEvent?) {
            println("mouseClicked")
        }
        override fun mouseExited(e: MouseEvent?) {
            println("mouseExited")
        }
        override fun mousePressed(e: MouseEvent?) {
            println("mousePressed")
        }
    })
}

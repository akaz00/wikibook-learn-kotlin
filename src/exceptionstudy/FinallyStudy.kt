package exceptionstudy

import java.io.File
import java.io.FileOutputStream
import java.lang.Exception

fun main(args : Array<String>) {
    try {
        var d = 0
        var result = 10 / d
        println(result)
    } catch(e: Exception) {
        println("catch")
    } finally {
        println("finally")
    }

    /*
    var f : FileOutputStream? = null
    try {
        f = FileOutputStream("hello.txt")
        // f = FileOutputStream("hello?.txt")
        f.write(byteArrayOf(72, 101, 108, 108, 111))
        f?.flush()
        f?.close()
    } catch(e: Exception) {
        println(e.message)
    } finally {
        f?.close()
    }
    */

    FileOutputStream("hello.txt").use {
        it.write(byteArrayOf(72, 101, 108, 108, 111))
        it.flush()
    }
}
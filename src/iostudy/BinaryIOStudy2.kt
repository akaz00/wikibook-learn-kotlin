package iostudy

import java.io.*

fun main(args : Array<String>) {
    val personFile = File("persons.bin")
    personFile.createNewFile()

    val p1 = Person("김철수", 20)
    val p2 = Person("이영희", 25)

    ObjectOutputStream(FileOutputStream(personFile)).use {
        it.writeObject(p1)
        it.writeObject(p2)
        it.writeInt(100)
        it.writeDouble(1.234)
        it.writeBoolean(true)
        it.writeUTF("Hello")
    }

    ObjectInputStream(FileInputStream(personFile)).use {
        val p1FromFile = it.readObject() as Person
        val p2FromFile = it.readObject() as Person
        val intFromFile = it.readInt()
        val doubleFromFile = it.readDouble()
        val booleanFromFile = it.readBoolean()
        val stringFromFile = it.readUTF()

        println(p1FromFile)
        println(p2FromFile)
        println(intFromFile)
        println(doubleFromFile)
        println(booleanFromFile)
        println(stringFromFile)
    }
}
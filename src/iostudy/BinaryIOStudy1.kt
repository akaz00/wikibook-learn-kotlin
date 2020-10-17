package iostudy

import java.io.*

data class Person(var name: String, var age: Int) : Serializable

fun main(args : Array<String>) {
    // 직렬화된 사람 정보를 저장하기 위해서 파일 생성
    val personFile = File("persons.bin")
    personFile.createNewFile()

    val p1 = Person("김철수", 20)
    val p2 = Person("이영희", 25)

    // 바이너리 내용 쓰기
    val oos = ObjectOutputStream(FileOutputStream(personFile))
    oos.writeObject(p1)
    oos.writeObject(p2)
    oos.writeInt(100)
    oos.writeDouble(1.234)
    oos.writeBoolean(true)
    oos.writeUTF("Hello")
    oos.flush()
    oos.close()

    // 바이너리 내용 읽기
    val ois = ObjectInputStream(FileInputStream(personFile))
    val p1FromFile = ois.readObject() as Person
    val p2FromFile = ois.readObject() as Person
    val intFromFile = ois.readInt()
    val doubleFromFile = ois.readDouble()
    val booleanFromFile = ois.readBoolean()
    val stringFromFile = ois.readUTF()
    ois.close()

    // 파일로부터 읽어온 내용 출력
    println(p1FromFile)
    println(p2FromFile)
    println(intFromFile)
    println(doubleFromFile)
    println(booleanFromFile)
    println(stringFromFile)
}
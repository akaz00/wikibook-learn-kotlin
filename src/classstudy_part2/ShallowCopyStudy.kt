package classstudy_part2

data class PersonForShallowCopy(var name : String, var age: Int, var favorites: MutableList<String>)

fun main(args : Array<String>) {
    val p = PersonForShallowCopy("김철수", 20, mutableListOf("게임", "독서", "요리"))
    val copied = p.copy()

    println(p.name === copied.name)
    println(p.age === copied.age)
    println(p.favorites === copied.favorites)
    println("p : ${p}")
    println("copied : ${copied}")

    copied.name = "이영희"
    copied.age = 30
    copied.favorites[0] = "수영"
    copied.favorites.add("등산")

    println(p.name === copied.name)
    println(p.age === copied.age)
    println(p.favorites === copied.favorites)
    println("p : ${p}")
    println("copied : ${copied}")

    copied.favorites = mutableListOf<String>()
    copied.favorites.add("수영")
    copied.favorites.add("등산")

    println(p.name === copied.name)
    println(p.age === copied.age)
    println(p.favorites === copied.favorites)
    println("p : ${p}")
    println("copied : ${copied}")
}
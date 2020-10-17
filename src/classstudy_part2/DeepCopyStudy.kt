package classstudy_part2

data class PersonForDeepCopy(var name : String, var age: Int, var favorites: MutableList<String>) {
    // (1) deep copy 메소드 직접 정의
    fun deepCopy(name: String? = null,
                 age: Int? = null,
                 favorites: MutableList<String>? = null) : PersonForDeepCopy {
        //
        val f = if(favorites == null) {
            val deepCopiedList = mutableListOf<String>()
            for(fav in this.favorites) {
                deepCopiedList.add(fav)
            }
            deepCopiedList
        } else {
            favorites
        }

        return PersonForDeepCopy(name ?: this.name, age ?: this.age, f)
    }

    // (2) copy constructor 정의
    constructor(other : PersonForDeepCopy) : this(other.name, other.age, other.favorites) {
        this.favorites = favorites.toMutableList()
    }
}

fun main(args : Array<String>) {

    val pd = PersonForDeepCopy("김철수", 20, mutableListOf("게임", "독서", "요리"))
    val deepCopied = pd.deepCopy()
    // val deepCopied = PersonForDeepCopy(pd)

    println(pd.favorites === deepCopied.favorites)
    deepCopied.favorites[0] = "수영"
    deepCopied.favorites.add("등산")

    println(pd)
    println(deepCopied)
}
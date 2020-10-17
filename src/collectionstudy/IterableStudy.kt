package collectionstudy

// (1)
class FruitsIterable : Iterable<String> {
    val fruits = listOf("Apple", "Banana", "Grape")

    // (2)
    override fun iterator(): Iterator<String> {
        // (3)
        return object : Iterator<String> {
            var idx = 0
            // (4)
            override fun hasNext() = idx < 3
            // (5)
            override fun next() = fruits[idx++]
        }
    }
}

// (1)
class MyList<T>(vararg val args: T): Iterable<T> {
    // (3)
    private class MyListIterator<T2>(val args: Array<T2>) : Iterator<T2> {
        var currentIdx = 0
        // (4)
        override fun hasNext(): Boolean {
            return currentIdx < args.size
        }
        override fun next(): T2 {
            val r = args[currentIdx]
            currentIdx++
            return r
        }
    }

    override fun iterator(): Iterator<T> {
        // (2)
        return MyListIterator(args)
    }
}

fun main(args : Array<String>) {

    val fruitsIterable = FruitsIterable()

    // (1)
    println("iterator 객체를 이용하여 직접 순회")
    var iterator = fruitsIterable.iterator()
    while(true) {
        // (2)
        if(iterator.hasNext()) {
            val next = iterator.next()
            print("$next ")
        } else {
            break
        }
    }
    println()

    // (3)
    println("for 구문을 활용한 순회")
    for(fruit in fruitsIterable) {
        print("$fruit ")
    }
    println()

    // (3)
    println("콜렉션에서 제공하는 forEach 함수를 사용한 순회")
    fruitsIterable.forEach { fruit -> print("$fruit ") }
    println()

    var myList1 = MyList(1, 2, 3, 4, 5)
    for(item in myList1) {
        print("$item ")
    }
    println()

    var myList2 = MyList("Hello", "World", "Kotlin")
    for(item in myList2) {
        print("$item ")
    }
    println()
}
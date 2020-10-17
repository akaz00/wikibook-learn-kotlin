package classstudy_part2

// (1)
class CompanionObjectClass(var x: Int) {
    fun instanceFunction() {
        println("from instance function ${x}")
    }

    companion object {
        // (2)
        var classVariable: Int = 100
        const val CLASS_CONSTANT: Int = 200

        fun classFunc() {
            classVariable++
            println("class variable value : $classVariable")
            println("class constant value : $CLASS_CONSTANT")
        }
    }
}

class Product(val name: String, val price: Double, var discountRate: Double) {
    companion object {
        // (1)
        fun calculatePrice(product : Product) : Double {
            return product.price - (product.price * product.discountRate)
        }

        // (2)
        fun calculateTotal(products : List<Product>) : Double {
            var total = 0.0
            for(p in products) total += Product.calculatePrice(p)
            return total
        }
    }
}

fun main(args : Array<String>) {

    // (1)
    var c = CompanionObjectClass(100)
    c.instanceFunction()
    println(c.x)

    // (2)
    CompanionObjectClass.classFunc()
    println(CompanionObjectClass.classVariable)
    println(CompanionObjectClass.CLASS_CONSTANT)

    val p1 = Product("장난감", 1000.0, 0.1)
    val p2 = Product("책", 5000.0, 0.0)
    println(Product.calculatePrice(p1))
    println(Product.calculateTotal(listOf(p1, p2)))
}
package challenges.ch06

class Point(var x: Double, var y: Double) {
    fun calculateDistanceFrom(other: Point): Double {
        val distance = Math.sqrt(Math.pow(this.x - other.x, 2.0) + Math.pow(this.y - other.y, 2.0))
        return distance
    }

    fun move(other: Point) : Point {
        return Point(this.x + other.x, this.y + other.y)
    }
}

fun main(args : Array<String>) {
    val p1 = Point(0.0, 0.0)
    val p2 = Point(5.0, 5.0)
    println(p1.calculateDistanceFrom(p2))

    val p3 = Point(2.0, 1.0)
    val p4 = Point(4.0, 7.0)
    val p5 = p3.move(p4)
    println("${p5.x},${p5.y}")
}
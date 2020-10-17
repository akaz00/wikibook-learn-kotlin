package challenges.ch05

fun calculateDistance(p1x: Double, p1y: Double, p2x: Double, p2y: Double): Double {
    val distance = Math.sqrt(Math.pow(p2x - p1x, 2.0) + Math.pow(p2y - p1y, 2.0))
    return distance
}

fun main(args : Array<String>) {
    val distance = calculateDistance(0.0, 0.0, 5.0, 5.0)
    println(distance)
}
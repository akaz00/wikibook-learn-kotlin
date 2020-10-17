package challenges.ch05

fun calculateCircleArea(radius: Double) : Double = Math.PI * (radius * radius)
fun calculateBMI(height: Double, weight: Double) = weight / (height * height)

fun main(args : Array<String>) {
    var area = calculateCircleArea(10.0)
    println(area)
    var bmi = calculateBMI(1.8, 80.0)
    println(bmi)
}
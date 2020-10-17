package challenges.ch06

class Fraction(var numerator: Int, var denominator: Int) {
    private fun lcm(a: Int, b: Int) : Int {
        return (a * b) / gcd(a, b)
    }

    private fun gcd(a: Int, b: Int) : Int {
        var gcd = 1
        for(i in 2..kotlin.math.min(a, b)) {
            if(a % i == 0 && b % i == 0) {
                gcd = i
            }
        }
        return gcd
    }

    infix fun add(f: Fraction) : Fraction {
        if(this.denominator == f.denominator) {
            return Fraction(this.numerator + f.numerator, this.denominator)
        } else {
            var lcm = lcm(this.denominator, f.denominator)

            return Fraction(this.numerator * (lcm / this.denominator) +
                f.numerator * (lcm / f.denominator),
                lcm)
        }
    }

    infix fun sub(f: Fraction) : Fraction {
        if(this.denominator == f.denominator) {
            return Fraction(this.numerator - f.numerator, this.denominator)
        } else {
            var lcm = lcm(this.denominator, f.denominator)

            return Fraction(this.numerator * (lcm / this.denominator) -
                f.numerator * (lcm / f.denominator),
                lcm)
        }
    }

    fun toDouble() : Double {
        return numerator.toDouble() / denominator
    }

    override fun toString(): String {
        return "${numerator}/${denominator}"
    }
}

fun main(args : Array<String>) {
    var f1 = Fraction(3, 4)
    var f2 = Fraction(1, 10)

    println(f1)
    println(f2)

    println(f1.toDouble())

    // 일반적인 메소드 호출 방식으로 호출
    var f3 = f1.add(f2)
    // 중위 표기법 방식으로 호출
    var f4 = f1 sub f2

    println(f3)
    println(f4)
}
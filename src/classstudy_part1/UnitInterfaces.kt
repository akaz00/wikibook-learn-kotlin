package classstudy_part1

// (1)
abstract class Unit(val name: String, var dead: Boolean = false, var health: Int = 100) {
    fun printAttackMessage(other: Unit) {
        println("${name}이 ${other.name}을 공격합니다.")
    }
    fun printRepairMessage(other: Unit) {
        println("${name}이 ${other.name}을 수리합니다.")
    }
}

// (2)
interface Attackable {
    fun attack(other: Unit)
}
interface Repairable {
    fun repair(other: Unit)
}

// (3)
class AttackUnit(name: String, val attackAmount: Int) : Unit(name), Attackable {
    override fun attack(other: Unit) {
        printAttackMessage(other)
        other.health -= attackAmount
        if(other.health <= 0) other.dead = true
    }
}

// (4)
class RepairUnit(name: String, val repairAmount: Int) : Unit(name), Repairable {
    override fun repair(other: Unit) {
        if(!other.dead)
            printRepairMessage(other)
        other.health += repairAmount
    }
}

// (5)
class GodLikeUnit(name: String) : Unit(name), Attackable, Repairable {
    init {
        health = 1000000
    }

    override fun attack(other: Unit) {
        printAttackMessage(other)
        other.health = 0
        other.dead = true
    }

    override fun repair(other: Unit) {
        printRepairMessage(other)
        other.dead = false
        other.health = 100
    }
}

fun main() {
    val unit1 = AttackUnit("공격 유닛 a", 80)
    val unit2 = RepairUnit("수리 유닛 b", 50)
    val godUnit = GodLikeUnit("만능 유닛 c")

    unit1.attack(godUnit)
    unit1.attack(unit2)
    unit2.repair(godUnit)
    godUnit.attack(unit1)

    println("godUnit.health : " + godUnit.health)
    println("unit2.health : " + unit2.health)
    println("unit1.health : " + unit1.health)
    println("unit2.dead : " + unit2.dead)
    println("unit1.dead : " + unit1.dead)
}

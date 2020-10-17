package classstudy_part1

// (1)
abstract class Phone {
    var turnOn = false

    fun turnOn() {
        turnOn = true
        boot()
    }

    fun turnOff() {
        turnOn = false
    }

    // (3)
    fun boot() {
        checkSystem()
        checkUpdate()
        showMainUI()
    }

    // (4)
    abstract fun checkUpdate()
    abstract fun checkSystem()
    abstract fun showMainUI()
}

// (5)
class GalaxyS : Phone() {
    override fun checkSystem() {
        println("CPU, RAM, 하드, 카메라, 삼성 핸드폰 전용 기능을 체크")
    }
    override fun checkUpdate() {
        println("삼성 서버로 업데이트 가능 여부 호출하기.")
    }
    override fun showMainUI() {
        println("삼성 UI 보여주기.")
    }
}

// (6)
class V30 : Phone() {
    override fun checkSystem() {
        println("CPU, RAM, 하드, 카메라, LG 핸드폰 전용 기능을 체크")
    }
    override fun checkUpdate() {
        println("LG 서버로 업데이트 가능 여부 호출하기.")
    }
    override fun showMainUI() {
        println("LG UI 보여주기.")
    }
}

fun main(args : Array<String>) {

    val p1 = GalaxyS()
    val p2 = V30()

    p1.turnOn()
    p1.turnOff()

    p2.turnOn()
    p2.turnOff()
}
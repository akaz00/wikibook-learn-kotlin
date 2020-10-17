package classstudy_part1

class Car {
    /* 속성 정의 */
    // 현재 속도
    var speed: Int = 0
    // 차가 움직이고 있는지 여부
    var isMoving: Boolean = true

    /* 메서드 정의 */
    // 가속
    fun accelerate() {
        speed += 10
    }
    // 감속
    fun decelerate() {
        speed -= 10
        if(speed < 0) speed = 0
    }
    // 이동
    fun move() {
        isMoving = true
    }
    // 정지
    fun stop() {
        isMoving = false
    }
    // 현재 속도 출력
    fun showSpeed() {
        println("current speed : $speed")
    }
}

fun main(args : Array<String>) {
    var c = Car()
    // 차가 움직일 수 있도록 조정
    c.move()
    // 현재 움직이고 있는지 여부를 출력
    println(c.isMoving)

    c.accelerate()
    // 현재 속도를 출력
    c.showSpeed()
    c.decelerate()

    c.stop()
    // 차를 멈추도록 stop 메소드를 호출한 직후이므로 false 출력
    println(c.isMoving)
}

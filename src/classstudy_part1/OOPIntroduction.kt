package classstudy_part1

class Television(
        val manufacturer : String,
        var currentChannel : Int,
        var currentVolume : Int,
        var turnOn : Boolean = false
) {
    // 전원 인가 기능
    fun turnOn() {
        turnOn = true
    }
    fun turnOff() {
        turnOn = false
    }

    // 채널 조정 기능
    fun adjustChannel(newChannel : Int) {
        if(newChannel in 1 .. 60) {
            currentChannel = newChannel
        }
    }

    // 볼륨 조정 기능
    fun increaseVolume() {
        if(currentVolume <= 100) {
            currentVolume++
        }
    }
    fun decreaseVolume() {
        if(currentVolume > 0) {
            currentVolume--
        }
    }
    fun adjustVolume(newVolume : Int) {
        currentVolume = newVolume
    }

    // 음소거
    fun mute() {
        currentVolume = 0
    }

    override fun toString(): String {
        return "Television(manufacturer='$manufacturer', currentChannel=$currentChannel, currentVolume=$currentVolume, turnOn=$turnOn)"
    }
}

fun main(args : Array<String>) {
    var samsungTV = Television("삼성", 1, 1)
    println(samsungTV)

    // 전원 켜기
    samsungTV.turnOn()
    println(samsungTV)

    // 볼륨 조정
    samsungTV.adjustVolume(50)
    samsungTV.increaseVolume()
    println(samsungTV)

    // 채널 조정
    samsungTV.adjustChannel(42)
    println(samsungTV)

    // 음소거
    samsungTV.mute()
    println(samsungTV)

    // 전원 끄기
    samsungTV.turnOff()
    println(samsungTV)
}




















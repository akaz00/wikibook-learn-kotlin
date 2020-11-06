package controlstudy

fun main(args : Array<String>) {
    var sum = 0
    var i = 0
    while(true) {
        sum += i
        i++
        if(i > 10) {
            println("break 명령어 실행")
            break
        }
    }
    println(sum)

    // break 명령어 사용 코드
    for(i in 1..10) {
        println(i)

        break

        println("after break")
    }

    println("중첩된 반복문 내에서 break 명령어 사용")
    for(i in 1..3) {
        println("outer loop : $i")
        for(j in 1..3) {
            println("inner loop : $j")
            break
        }
    }

    // break, continue
    while(true) {
        print("'b'를 입력하여 break 명령어를 실행 : ")
        var input = readLine()?.trim()

        if(input != null) {
            if(input == "b") {
                println("break 명령어를 이용하여 반복문을 탈출합니다.")
                break // 반복문 탈출
            } else {
                println("${input}을 입력하셨습니다.")
            }
        }
    }

    // continue 명령어 사용 코드
    println("짝수단만 출력")
    for (i in 2..9) {
        // 만약 홀수 단이라면 뒤의 명령어는 무시하고 다시 반복문 재개
        if (i % 2 != 0) continue
        for (j in 1..9) {
            println("$i x $j = ${i * j}")
        }
    }
}
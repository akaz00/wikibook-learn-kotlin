package iostudy

import java.io.File
import java.util.Date

fun main(args : Array<String>) {
    // 파일 생성
    val f1 = File("file1.txt")
    if(f1.createNewFile()) {
        // 파일이 생성되었다면 참 반환
        f1.writeText("Hello")
    } else {
        // 파일이 이미 존재한다면 거짓 반환
        // writeText 호출 시 이미 존재하는 내용은 삭제되고 덮어씌워지는 것을 주의!
        f1.writeText("World")
    }

    // 파일 관련 정보 출력

    // 바이트 단위의 파일 크기 반환
    println("f1.length : ${f1.length()}")

    // 파일의 확장자 반환
    println("f1.extension : ${f1.extension}")

    // 파일의 경로 반환
    println("f1.path : ${f1.path}")

    // 파일이 위치한 절대 경로 반환
    println("f1.absolutePath : ${f1.absolutePath}")

    // 파일인지 디렉토리인지 여부 반환
    println("f1.isFile : ${f1.isFile}")
    println("f1.isDirectory : ${f1.isDirectory}")

    // 파일의 최종 수정 날짜를 반환
    var lastModified : Long = f1.lastModified()
    println("f1.lastModified : $lastModified")
    println("f1.lastModified (Date) : ${Date(lastModified)}")

    // 파일의 존재 여부를 반환
    println("f1.exists() : ${f1.exists()}")

    // 파일 삭제
    // f1.delete()

    val f2 = File("file2.txt")
    if(f2.createNewFile()) {
        f2.writeText("Hello")
    } else {
        // 파일이 존재한다면 계속해서 내용을 추가(append)하도록 함
        f2.appendText("\nWorld")
    }
}
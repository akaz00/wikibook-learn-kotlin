package iostudy

import java.io.File

fun main(args : Array<String>) {
    // 디렉토리 다루기
    val dir = File("mydir")
    // 디렉토리 생성
    dir.mkdir()
    // isDirectory 메소드 호출하여 디렉토리인지 여부 확인 가능
    println("dir.isDirectory : ${dir.isDirectory}")
    println(dir.isDirectory)
    // 디렉토리 삭제
    dir.delete()

    // 폴더 구분자(/)를 포함한 서브 디렉토리 경로 설정
    val subdir = File("mydir2/subdir")
    // 여러 디렉토리 생성 (최종적으로 생성할 서브 디렉토리에 필요한 디렉토리가 없으면 모두 생성)
    subdir.mkdirs()

    val parentDir = subdir.parentFile
    println(parentDir.name)
    // 디렉토리를 삭제하며 내부에 딸린 서브 디렉토리도 모두 삭제
    parentDir.deleteRecursively()
}

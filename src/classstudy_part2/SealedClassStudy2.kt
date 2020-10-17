package classstudy_part2

sealed class Quiz(val question: String)

enum class AnswerType { O, X  }

// OX 퀴즈
class OXQuiz(question : String, val answer: AnswerType) : Quiz(question)

// N지선다 퀴즈
class MultiChoiceQuiz(question : String, val answer: String, val choices: List<String>) : Quiz(question)

// 단답식 퀴즈
class ShortAnswerQuiz(question : String, val answer: String, val alternatives : List<String>?,
                      val sanitize : (String) -> String = { it.trim() }) : Quiz(question)

fun main(args : Array<String>) {

    // (1)
    val quizzes = mutableListOf<Quiz>()

    // (2)
    quizzes.add(OXQuiz("대한민국의 수도는 서울이다.", AnswerType.O))
    quizzes.add(OXQuiz("미국의 수도는 뉴욕이다.", AnswerType.X))
    quizzes.add(MultiChoiceQuiz("대한민국의 수도는?", "서울", listOf("서울", "대전", "대구", "부산")))
    quizzes.add(ShortAnswerQuiz("사과를 뜻하는 영단어는?", "apple", null) { it.trim().toLowerCase() })
    quizzes.add(ShortAnswerQuiz("JetBrains사에서 만든 JVM 기반 프로그래밍 언어는?", "Kotlin", listOf("코틀린", "kotlin")))

    // (3)
    for(q in quizzes) {
        var question : String
        var answer : String
        question = q.question

        var type = when(q) {
            // (4)
            is OXQuiz -> {
                // (5)
                answer = when(q.answer) {
                    AnswerType.O -> "O"
                    AnswerType.X -> "X"
                    // (enum 상수는 선택지 개수에 제약이 있고 모든 조건에 대한 분기문을 제공하므로) else 브랜치 불필요
                }
                "OX 퀴즈"
            }
            is MultiChoiceQuiz -> {
                answer = q.answer
                "N지선다 퀴즈"
            }
            is ShortAnswerQuiz -> {
                answer = q.answer
                "단답식 퀴즈"
            }
            // (Sealed 클래스는 선택할 수 있는 타입의 개수에 제약이 있고 모든 타입에 대한 분기문을 제공하므로) else 브랜치 불필요
        }

        println("유형 : ${type}\n질문 : ${q.question}\n답 : ${answer}")
    }
}